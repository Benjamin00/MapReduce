import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Stemmer {

	public static void main(String[] args) throws IOException {
		Reader readerObject = new InputStreamReader(System.in);
		BufferedReader bufferedReaderObj = new BufferedReader(readerObject);
		String read = ReadBigString(bufferedReaderObj);
		String line = Stemmer(read);
		System.out.println(line);
		
		
		
		/*String read;
		while((read = bufferedReaderObj.readLine())!=null)
		{
			read = read.toLowerCase();
			String line = Stemmer(read);
	        System.out.println(line);
		}*/
		
	}
	
	public static String ReadBigString(BufferedReader buffIn) throws IOException
	{
		StringBuilder everything = new StringBuilder();
		String line;
		while((line = buffIn.readLine())!=null)
		{
			everything.append(line);
			everything.append(" ");
		}
		return everything.toString();
	}
	
	public static String Stemmer(String line)
	{
		line = line.replaceAll("\\p{P}", " ");//punc
		line = line.replaceAll("\\s+", " ");
		line = line.replaceAll(" a ", " ");
		line = line.replaceAll("\\n", " ");
		line = line.replaceAll(" an ", " ");
		line = line.replaceAll(" and ", " ");
		line = line.replaceAll(" are ", " ");
		line = line.replaceAll(" as ", " ");
		line = line.replaceAll(" at ", " ");
		line = line.replaceAll(" be ", " ");
		line = line.replaceAll(" by ", " ");
		line = line.replaceAll(" for ", " ");
		line = line.replaceAll(" from ", " ");
		line = line.replaceAll(" has ", " ");
		line = line.replaceAll(" he ", " ");
		line = line.replaceAll(" in ", " ");
		line = line.replaceAll(" is ", " ");
		line = line.replaceAll(" it ", " ");
		line = line.replaceAll(" its ", " ");
		line = line.replaceAll(" of ", " ");
		line = line.replaceAll(" on ", " ");
		line = line.replaceAll(" that ", " ");
		line = line.replaceAll(" the ", " ");
		line = line.replaceAll(" to ", " ");
		line = line.replaceAll(" was ", " ");
		line = line.replaceAll(" were ", " ");
		line = line.replaceAll(" will ", " ");
		line = line.replaceAll(" with ", " ");
		//System.out.println(line);
		return line;
	}

}
