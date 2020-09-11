import java.io.*;
import java.util.*;

public class Menu {
	Console cons = new Console();
	Scanner sc = new Scanner(System.in);
	En d = new En();
	Dict s = new Dict();
	Dop dop = new Dop();
	
	
	

	 
	
	
	public String start() {
		
		
		cons.constart(); 
		
		String nameDict;
		
			switch(dop.getInt())
			{
				
			
			case 0:
				System.exit(0);
			case 1:
			
				return nameDict = "Dict1.txt";
				 
			
			case 2:
				return nameDict = "Dict2.txt";
				
				
			default:
			{
				cons.Err();
				
			
				nameDict =start();
				return nameDict;
				
				
			}
				
		}
		
		
		
			
	}
	
	
	
	public void Kre(String nameDict){
		
		String keyEn =cons.key();
		
		if(s.isDefWord(nameDict, keyEn))
					d.Work(nameDict, keyEn ,cons.One());
				else
				{
					System.out.println("Again" );
					Kre(nameDict);
					
					
				}
		
	}
	
	
	
	
	
	
	public  void startCont(String nameDict){
		
		
		
		int num;
		cons.conStartTwo(nameDict);
		
		num = dop.getInt();
		
		switch(num)
		
		{
			case 0:
				start();
				
				break;
							
			case 1:
		
				Kre(nameDict);
							
								
				break;
				
			case 2:
				d.reader(nameDict);
				break;
				
			case 3:
				
				d.delWord(cons.key(), nameDict);
			
				break;
				
			case 4:
			
				
				d.find(cons.key(), nameDict);
				
				
				break;
				
			default: 
				
				
				
				try{
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				}catch (Exception e)
				{
					System.out.println(e);
					
				}
				
				
				cons.Err();
				
			
		
	}
		startCont(nameDict);
	
	
			
	
}
}