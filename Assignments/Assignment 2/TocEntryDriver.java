/*
	Driver program for Toc Entry
	Name of chapter?
	Page number?
	Enter **** when finished.
	
	while vs for?
	while user entry is not ****
	
	arrays must be of the same type
*/

import java.util.Scanner;

public class TocEntryDriver 
{
	public static void main(String[] args)
	{ 
		final int TOCSIZE = 100;
		TocEntry toc[] = new TocEntry[TOCSIZE];
		int toc_curlen = 0; 
		String chapter = "";
		int page = 0;
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			chapter = "";
			page = 0;
			
			System.out.println("Enter chapter title: ");
			chapter = in.nextLine();
			if(chapter.equals("****")) // checks if user is done
				break;
			
			System.out.println("Enter starting page number: ");
			page = Integer.parseInt(in.nextLine()); // changes to int
			
			System.out.println(" ");
			
			toc[toc_curlen++] = new TocEntry(chapter, page); //indexes
		}
		
		for (int i = 0; i < toc_curlen; i++)
			System.out.println(toc[i]);
		

	}
}
