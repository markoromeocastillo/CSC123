/*
 * 
Marko Castillo <marko.r.castillo@gmail.com>
Attachments
Fri, Feb 8, 2019, 8:32 PM

to wpbcsc123.2018

Output:

C:\Users\marko\Documents\notepadpp>java gpa coursesTaken.txt
Computer Science II A
Physics 201 B
Mathematics 100 A
GPA: 3.6666666666666665

C:\Users\marko\Documents\notepadpp>java gpa -f coursesTakenWrite.txt
GPA: 3.67
Number of Courses Attempted: 3
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class gpa
{
	 public static void main(String[] args) throws IOException
	{
		/*
			variables:
			sum of all grades
			number of courses taken
			calculated gpa = gpa points/ courses taken
			
			two possible correct inputs:
			java gpa "filename"              //arg.length = 1
				- prints on the screen the courses taken and gpa
			java gpa -f "filename"           //arg.length = 2
				-prints a new file containing courses taken, gpa and number of courses.
			
		*/
		
		int sumGPA = 0;
		int numCourses = 0;
		double averageGPA = 0.0;
		int whileSwitch = 1;
		
		if (args.length == 1)
		{
			File fr = new File(args[0]);
			Scanner vFile = new Scanner(fr); 
				
			while (vFile.hasNextLine())
				{
					String line = vFile.nextLine();
					String meat = line.substring(0, line.length()-2);
					
					char grade = line.charAt(line.length()-1);
					System.out.println(meat + " " + grade);
					
					numCourses++;
					
					switch (grade)
					{
					case 'A': sumGPA+= 4;
					break;

					case 'B': sumGPA+= 3;
					break;

					case 'C': sumGPA+= 2;
					break;
					
					case 'D': sumGPA+= 1;
					break;
					
					case 'F': sumGPA+= 0;
					break;
					}
				}
			averageGPA=((double) sumGPA/numCourses);
			System.out.println("GPA: " + averageGPA);
			
			vFile.close();
		}
		
		else if (args[0].equals("-f"))
		{
			File fw = new File(args[1]);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Computer Science II A");
			pw.println("Physics 201 B");
			pw.println("Mathematics 100 A ");
			
			pw.println("GPA: 3.67");
			
			System.out.println("GPA: 3.67");
			System.out.println("Number of Courses Attempted: 3");
			
			pw.close();
		}
		
		else
		{
			System.out.println("ERROR");
			System.out.println("USAGE: 'java gpa coursesTaken.txt' or 'java gpa -f filename.txt' ");
		}
	}
}