import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public  class En {
	
	Hashtable<String, String> my_dict = new Hashtable<String, String>();

    public void Work (String name, String keyEn,String wordRus) {

        // creating a My HashTable Dictionary
        

        // Using a few dictionary Class methods
        // using put method
        my_dict.put(keyEn, wordRus);
        
        String text = "\n" + keyEn + "," + wordRus+"\n";
		
			
		
		

        File myFile = new File(name);

        try {
            BufferedWriter  writ = new BufferedWriter (new FileWriter(myFile, true));
            writ.write(text);
            writ.flush();
            writ.close();



        } catch (IOException e) {

            System.out.println("Error ==" + e);
        }


	}
	
	public void delWord(String KeyEn){
		my_dict.remove(KeyEn);
	}
	



        

    }








