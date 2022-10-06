import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class type
{
	public static void main(String[] args) throws IOException
	{
		
	if (args.length == 1)
		{	
		File fr = new File(args[0]);
		
		if (!fr.exists())
			{
			System.out.println("Error: file " + args[0] + " not found.\n");
			System.exit(0);
			}
			
		Scanner infile = new Scanner(fr);
		
		while (infile.hasNextLine())
			{
			String line = infile.nextLine();
			System.out.println(line);
			}
			
		infile.close();
		}
	else if (args.length == 2 && args[0].equals("-u") )
		{
		File ab = new File(args[1]);
		Scanner hello = new Scanner(ab);
		
		while (hello.hasNextLine())
			{
			String line = hello.nextLine();
			System.out.println(line.toUpperCase());
			}
		}
	else if (args.length == 2 && args[0].equals("-l") )
		{
		File ac = new File(args[1]);
		Scanner hi = new Scanner(ac);
		
		while (hi.hasNextLine())
			{
			String line = hi.nextLine();
			System.out.println(line.toLowerCase());
			}
		}		
	else
		System.out.println("Usage: java type [-u] or [-l] filename\n");
		}
}

/*
1. java type test
2. java type -u test
3. java type -l test
*/