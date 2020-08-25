import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class Dict {
	
	
	public Boolean isDefWord(String name, String key) {
		
		Pattern patlatletter;
		Matcher matlatletter;
		
		switch(name){
			
				case "Dict1.txt": {
					patlatletter = Pattern.compile("[a-zA-Z]+");
					matlatletter = patlatletter.matcher(key);
					
					if ((key.length()==4) && matlatletter.matches()) {
						return true;
					}
					
					else 
						return false;
				}
					
					
					
				case ("Dict2.txt"): {
					
					patlatletter = Pattern.compile("[0-9]+");
					matlatletter = patlatletter.matcher(key);
					
						if ((key.length()==5) && matlatletter.matches()) {
							return true;
						}
						else 
							return false;
						
				}
					
					
			
			
		}
		       
		
		
	}
	
	
	
}