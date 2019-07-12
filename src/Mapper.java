import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
	static List<String> stringList = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		Reader readerObject = new InputStreamReader(System.in);
		BufferedReader bufferedReaderObj = new BufferedReader(readerObject);
		String str = bufferedReaderObj.readLine(); 
        Mapper(str);
        System.out.print(stringList);
	}
	
	

	public static void Mapper(String line)
	{
		String[] tokens = line.split(" ");
		for(String temp: tokens)
		{
			temp = temp.toLowerCase();
			temp += " 1";
			//System.out.print(temp);
			stringList.add(temp);
		}
	}
}
