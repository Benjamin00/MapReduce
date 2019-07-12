
public class Stemmer {

	public static void main(String[] args) {
		Stemmer("This is an example");

	}
	
	public static void Stemmer(String line)
	{
		/*String[] stemmed;
		String[] tokens = line.split(" ");
		for(String word: tokens)
		{
			String temp = word.toLowerCase();
			if(temp.equals("a")||temp.equals("an")||temp.equals("and")||temp.equals("are")||temp.equals("as")||temp.equals("at")||temp.equals("be")||temp.equals("by")||temp.equals("for")||temp.equals("from")||temp.equals("has")||temp.equals("he")||temp.equals("in")||temp.equals("is")||temp.equals("it")||temp.equals("its")||temp.equals("of")||temp.equals("on")||temp.equals("that")||temp.equals("the")||temp.equals("to")||temp.equals("was")||temp.equals("were")||temp.equals("will")||temp.equals("with"))
			{
				word = line.replace(word, "");
			}
			//stemmed
		}*/
		line = line.replace(" a ", " ");
		line = line.replace(" an ", " ");
		line = line.replace(" and ", " ");
		line = line.replace(" are ", " ");
		line = line.replace(" as ", " ");
		line = line.replace(" at ", " ");
		line = line.replace(" be ", " ");
		line = line.replace(" by ", " ");
		line = line.replace(" for ", " ");
		line = line.replace(" from ", " ");
		line = line.replace(" has ", " ");
		line = line.replace(" he ", " ");
		line = line.replace(" in ", " ");
		line = line.replace(" is ", " ");
		line = line.replace(" it ", " ");
		line = line.replace(" its ", " ");
		line = line.replace(" of ", " ");
		line = line.replace(" on ", " ");
		line = line.replace(" that ", " ");
		line = line.replace(" the ", " ");
		line = line.replace(" to ", " ");
		line = line.replace(" was ", " ");
		line = line.replace(" were ", " ");
		line = line.replace(" will ", " ");
		line = line.replace(" with ", " ");
		System.out.println(line);
	}

}
