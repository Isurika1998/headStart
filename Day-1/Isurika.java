import java.util.*;
import java.io.*;

public class Isurika{
	public static void main(String args[]) throws FileNotFoundException{
		String str,line;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String To Check : ");
		str=input.next();
		Scanner file = new Scanner(new FileInputStream("C:\\java-workspace\\headStart\\Day-1\\example.txt"));
		while(file.hasNextLine()){
			line=file.nextLine();
			if(line.indexOf(str) != -1){
				System.out.println("File contains string...");
				return;
			}
		}
		System.out.println("File does not contain string...");
		
	}
	
}