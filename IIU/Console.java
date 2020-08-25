import java.io.*;
import java.util.*;

public class Console {
	Scanner sc = new Scanner(System.in);
	public  void constart() {
		
		System.out.print("\nEnter number operation: ");
			
			
            System.out.print("\n1 - Select 1 dictionary");
            System.out.print("\n2 - Select 2 dictionary");
            System.out.print("\n0 - Exit progam\n");

      		
	}
	
	public  void conStartTwo(String name) {
		
		System.out.print("active: " + name);
		System.out.print("\nEnter number operation: ");
			
			
            System.out.print("\nEnter number operation: ");
                System.out.print("\n1 - Add word");
                System.out.print("\n2 - Listing all words");
                System.out.print("\n3 - Remove word");
                System.out.print("\n4 - Find word");
                System.out.print("\n0 - Go to dictionary selection" + "\n");
      		
	}
	
	
	public String key() {
		System.out.print("Enter key: ");
		
		String wordEng = sc.nextLine();
		
		return wordEng;
		
		
	}
	
	public String One() {
		
		System.out.print("Enter value: ");
		String wordRus = sc.nextLine();
		
		return wordRus;
	}
	
	
	
			
	
}