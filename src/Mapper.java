import java.util.ArrayList;
import java.util.List;

public class Mapper {
	static List<String> stringList = new ArrayList<String>();
	public static void main(String[] args) {
		Mapper("desk is big desk");
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
