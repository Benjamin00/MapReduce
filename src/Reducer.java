import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
//use port 65539

//questions:
//1. how to handle communication
//2. am i runnable or thread
//3. who holds the threads, sender or reducer

//TODO communicate with sender
//TODO receive and act on message
//TODO add barrier

public class Reducer implements Runnable{
	//** HANDLER  **//
	private ServerSocket serverSocket;
    
    public void start(int port) {		//on start, will take the input on that port and create a new stemmer handler
        try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        while (true)
			try {
				new ReducerHandler(serverSocket.accept()).start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
 
    public void stop() {
        try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
    private static class ReducerHandler extends Thread {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
 
        public ReducerHandler(Socket socket) { //Initialization
            this.clientSocket = socket;
        }
 
        public void run() {//read the input
        	try {
	            out = new PrintWriter(clientSocket.getOutputStream(), true);
	            in = new BufferedReader(
	              new InputStreamReader(clientSocket.getInputStream()));
	        	
	            String inputLine;
	            while ((inputLine = in.readLine()) != null) {
	                if (".".equals(inputLine)) {
	                    out.println("bye");
	                    break;
	                }
	                out.println(inputLine);
	            }
	           
	            in.close();
	            out.close();
	            clientSocket.close();
        	}
        		catch(Exception e) {
        	}
    }

    }
    
    
	//hash table storing words and list of counts
	private HashMap<String, ArrayList<Integer>> wordTable; 
	//use a lock for the table
	private final Object wordLock = new Object();
	

	public static void main(String[] args) {
		System.out.println("started main in reducer...");
		Reducer server = new Reducer();
		server.start(65539);
	}
	
	//constructor
	public Reducer(){
		wordTable = new HashMap<String, ArrayList<Integer>>(100);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean handleMessage(String msg) {
		//1. parse message
		String parts[] = msg.split(" ");
		if(parts.length != 2) {
			System.out.println("ERROR: expected message format <string> <int>");
			return false;
		}
		String key = parts[0];
		int val = Integer.valueOf(parts[1]);
		
		//2. add to word table
		return update(key, val);
	}
	
	public boolean update(String key, int val) {
		//update word table with the key and value
		synchronized(wordLock){
			wordTable.get(key).add(val);
		}
		return true;
	}
	
	public void tallyResults() {
		for(String key: wordTable.keySet()){
			// get list of numbers for key
			ArrayList<Integer> counts = wordTable.get(key);
			int total = addAll(counts);
			System.out.println(key + String.valueOf(total));
		}
	}
	
	private static int addAll(ArrayList<Integer> counts) {
		int sum = 0;
		for(int val: counts) {
			sum += val;
		}
		return sum;
	}

}
