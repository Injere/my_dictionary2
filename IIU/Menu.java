import java.io.*;
import java.util.*;

public class Menu {
	Console cons = new Console();
	Scanner sc = new Scanner(System.in);
	En d = new En();
	
	public String start() {
		
		int choice=-1;
		String nameDict;
		
		
		cons.constart(); 
		
		
		//try {
		choice=sc.nextInt();
		System.out.println(choice);
		
	//	} catch (IOException e) {
      //      System.out.println(e);
   //     }
		
				
		
		switch(choice)
		{
			case 0:
				System.exit(0);
			case 1:
				return nameDict = "Dict1.txt";
				
				
				
			case 2:
				return nameDict = "Dict2.txt";
				
				
			default:
			{
				System.out.println(choice);
				nameDict = "not in menu";
				
				try{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				}catch (Exception e)
				{
					System.out.println(e);
				}
			
				start();
				break;
			}
				
		}
		
		
		return nameDict;
		
		
			
	}
	
	public  void startCont(String nameDict){
		
		
		cons.conStartTwo(nameDict);
		int num;
		
		do {
			num = sc.nextInt();
			
		}
		
		while (num>4 || num<0);
		
		
		System.out.println(num);
		
		switch(num)
		
		{
			case 0:
				start();
				
				break;
				
				
			case 1:
			boolean value;
				Dict s = new Dict();
				String keyEn =cons.key();
				
				if(s.isDefWord(nameDict, keyEn))
					d.Work(nameDict, keyEn ,cons.One());
				else
					System.out.println("Again" );
					keyEn =cons.key();
					startCont(nameDict);
					
				
								
				break;
				
			case 2:
				break;
				
			case 3:
				cons.key();
				d.delWord(cons.key());
			
				break;
				
			case 4:
			
				cons.key();
				
				
				break;
				
			default: 
				
				try{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				}catch (Exception e)
				{
					System.out.println(e);
					start();
				}
			
				
		
		
		
	}
	
	
	
			
	
}
}