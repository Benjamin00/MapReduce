import java.io.*;
import java.util.*;
//import java.lang.Integer;

public class Splitter {

	public static void main(String[] args) 
	{
		String filename = args[0];
		int numLines = Integer.parseInt(args[1]);
		int quarterNumber = Integer.parseInt(args[2]);

		// Calculates the line numbers for each of the quarters 

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


		
		
		
		// TESTING PURPOSES
		
		System.out.println(filename);
		System.out.println(numLines);
		System.out.println(quarterNumber);

		





	}



}
