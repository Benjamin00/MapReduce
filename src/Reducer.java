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
	//hash table storing words and list of counts
	private HashMap<String, ArrayList<Integer>> wordTable; 
	//use a lock for the table
	private final Object wordLock = new Object();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started main...");

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
