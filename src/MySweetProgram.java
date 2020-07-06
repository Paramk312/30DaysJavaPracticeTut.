import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


/* 
 * The video showed how to read from one text file, but I got curious and tried to see if it's possible to read more than one file.
*/

public class MySweetProgram {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("MotiveReminder.txt"));
		Scanner in2 = new Scanner(new File("Motive2.txt"));

		

		
		List<String> motivation = new ArrayList<String>();
		

		
		while(in.hasNextLine()){
			motivation.add(in.nextLine());
		}

			
			

		while(in2.hasNextLine()){
			motivation.add(in2.nextLine());
		}
		
		
		
		for(String mot: motivation) {
			System.out.println(mot);
		}
		
		
		in.close();
		in2.close();

		
		
		
	}

  }
