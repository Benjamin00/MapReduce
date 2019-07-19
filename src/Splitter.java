import java.io.*;
import java.util.*;
//import java.lang.Integer;

//import javax.lang.model.util.ElementScanner6;

public class Splitter {

	public static void main(String[] args) throws Exception
	{
		String filename = args[0];
		int numLines = Integer.parseInt(args[1]);
		int quarterNumber = Integer.parseInt(args[2]);

		// Determines the line numbers

		int startingLineNumber = 0;
		int endingLineNumber = 0;
		
		if (quarterNumber == 1)
		{
			startingLineNumber = 1;
			endingLineNumber = (int) (numLines / 4);
		}
		else if(quarterNumber == 2)
		{
			startingLineNumber = (int) (numLines / 4);
			endingLineNumber = (int) ((numLines * 2) / 4);
		}
		else if(quarterNumber == 3)
		{
			startingLineNumber = (int) ((numLines * 2) / 4);
			endingLineNumber = (int) ((numLines * 3) / 4);
		}
		else if(quarterNumber == 4)
		{
			startingLineNumber = (int) ((numLines * 3) / 4);
			endingLineNumber = numLines;
		}
		else
		{
			System.out.println("Invalid Quarter Number");
		}


		// Reads from the file according to the line numbers in the array

		// File is opened and read from here 

		// TODO: We need to make a test case file.

		/*

		File textFile = new File();
		
		BufferedReader buffReaderObj = new BufferedReader(new FileReader(textFile));

		String contentsOfQuarter = "";
		String lineContents = "";

		while((lineContents = buffReaderObj.readLine()) != null)
		{
			numIterations += 1;

			if(numIterations == startingLineForACertainQuarter)
			{
					// Reads from the line using the buffered reader object

					lineContents = buffReaderObj.readLine();
					contentsOfQuarter += lineContents;

					// contentsOfQuarter += "\n";
			}
		}
		


		System.out.println(contentsOfQuarter);
		*/





		// We then need to pipe the contents of the quarters















		
		
		
		// TESTING PURPOSES

		System.out.println("Starting Line Number: ");

		System.out.println(startingLineNumber + "\n");

		System.out.println("Ending Line Number: ");

		System.out.println(endingLineNumber + "\n");

		



	}



}
