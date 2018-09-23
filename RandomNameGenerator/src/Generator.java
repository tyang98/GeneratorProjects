import java.io.*;
import java.util.Scanner;
/**
 * Generates a name from a list of student names
 * @author Tony Yang
 */
public class Generator {

	final static int MAXNUMBER = 24;
	
	public static void main(String[] args) throws IOException
	{
		try {
			
			File f = new File("/Users/tyang/Desktop/deppe1stbc.txt");
			Scanner sc = new Scanner(f);
			int counter = 0;
			int rand = randNum();
			String line = null;
			while (sc.hasNext() && counter < rand)
			{
				line = sc.nextLine();
				counter++;
			}
			System.out.println(line);
			
		}
		catch (FileNotFoundException f) {
			System.out.println(f);
		}
		System.exit(0);
	}
			
	/**
	 * Returns a random number between 1 and 25
	 * @return Random number between 1 and 25
	 */
	public static int randNum()
	{
		int num;
		num = (int) (Math.random() * MAXNUMBER) + 1;
		return num;
 	}
}
