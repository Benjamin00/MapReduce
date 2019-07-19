import java.io.*;
import java.util.*;
//import java.lang.Integer;

import javax.lang.model.util.ElementScanner6;

public class Splitter {

	public static void main(String[] args) throws Exception
	{
		String filename = args[0];
		int numLines = Integer.parseInt(args[1]);
		int quarterNumber = Integer.parseInt(args[2]);

		// Calculates the line numbers for each of the quarters 

		/*

		int basicQuarterNumber = numLines / 4; 
		int numTimesToAddOne = numLines % 4;
		int[] numLinesInEachQuarter = new int[4];

		for (int x = 0; x < numLinesInEachQuarter.length; x++)
		{
			numLinesInEachQuarter[x] = basicQuarterNumber;
		}

		for (int y = 0; y < numTimesToAddOne; y++)
		{
			numLinesInEachQuarter[y] = numLinesInEachQuarter[y] + 1;
		}

		*/

		// Determines the line numbers
		
		if (quarterNumber == 1)
		{

		}
		else if(quarterNumber == 2)
		{

		}
		else if(quarterNumber == 3)
		{

		}
		else if(quarterNumber == 4)
		{

		}
		else
		{
			// Do nothing 
			// System.out.println("Invalid Quarter Number");
		}


		// Reads from the file according to the line numbers in the array

		// TODO: We need an example text file so that we can test this out. 
		// TODO: This is only one potential way to read from a file. It could be fixed later.  

		int numIterations = 0; 

		int beginningOfQuarter;
		int endOfQuarter; 

		if (quarterNumber == 1)
		{
			beginningOfQuarter = startingLineNumbers[0];
			endOfQuarter = startingLineNumbers[1];
		}
		else if (quarterNumber == 2)
		{
			beginningOfQuarter = startingLineNumbers[1] + 1;
			endOfQuarter = startingLineNumbers[2];
		}
		else if (quarterNumber == 3)
		{
			beginningOfQuarter = startingLineNumbers[2] + 1;
			endOfQuarter = startingLineNumbers[3];
		}
		else if (quarterNumber == 4)
		{
			beginningOfQuarter = startingLineNumbers[3] + 1;
			endOfQuarter = numLines;
		}
		else
		{
			// Do Nothing
		}

		// *** File is opened and read from here 

		// TODO: We need to make a test case file.

		File textFile = new File(/* Name of example text file should go here */);
		
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





		// We then need to pipe the contents of the quarters















		
		
		
		// TESTING PURPOSES
		
		System.out.println(filename);
		System.out.println(numLines);
		System.out.println(quarterNumber);

		System.out.println("\n" + "*** NumLinesInEachQuarter ***");

		for (int z = 0; z < numLinesInEachQuarter.length; z++)
		{
			System.out.println(numLinesInEachQuarter[z]);
		}

		System.out.println("\n" + "*** StartingLineNumbersForEachQuarter ***" + "\n");
		
		for (int a = 0; a < startingLineNumbers.length; a++)
		{
			System.out.println(startingLineNumbers[a]);
		}





	}



}
