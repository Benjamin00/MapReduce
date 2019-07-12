import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapper {

	public static void main(String[] args) {
		Mapper("This is Vivi Song");
		printMap();
	}
	
	static Map<String,Integer> map=new HashMap<String,Integer>(); 
	public static void Mapper(String line)
	{
		String[] tokens = line.split(" ");
		for(String temp: tokens)
		{
			temp = temp.toLowerCase();
			map.put(temp, 1);
		}
	}
	
	public static void printMap()
	{
		for (Entry<String, Integer> entry : map.entrySet()) {
		    System.out.print(entry.getKey() +  " "+ entry.getValue()+ ",");
		}
	}
}
