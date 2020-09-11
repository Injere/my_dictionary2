import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public  class En {
	
	Hashtable<String, String> my_dict = new Hashtable<String, String>();

    public void Work (String name, String keyEn,String wordRus) {
        my_dict.put(keyEn, wordRus);
        String text = keyEn + "," + wordRus;
        File myFile = new File(name);
		
        try {
		
			PrintWriter printWriter = new PrintWriter(new FileWriter(myFile, true));
			printWriter.println(text);
			printWriter.flush();
			
            
            printWriter.close();
			Scanner scanner = new Scanner(myFile);

        } catch (IOException e) {

            System.out.println("Error ==" + e);
        }

	}
	
	public void delWord(String KeyEn, String fileName){
		
		my_dict.remove(KeyEn);
	
				

		try	{
		
			File sourceFile = new File(fileName);
			
		
			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
		
			
		String line;
		String KeyEnT;
			
				
            while ((line= reader.readLine()) != null) {
				
				
                String[] words = line.split(",");
				KeyEnT =words[0];
				
				String wordRus = words[1];
				System.out.println(wordRus);
				if(!(KeyEn.equals(KeyEnT))) {
				
				
				Work("Dictio2.txt",KeyEnT, wordRus);
                
				}
            }
			
			
					reader.close();
					
					
				}
		
		 catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		}
	
	
	
	
	
	public void reader(String name) {
		  
        try {
            File file = new File(name);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
			String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	


	public void find (String KeyEn,String fileName) {
		
		try	{
		
			File sourceFile = new File(fileName);
			
		
			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
		
			
		String line;
		String KeyEnT;
			
				
            while ((line= reader.readLine()) != null) {
				
				
                String[] words = line.split(",");
				KeyEnT =words[0];
				
				String wordRus = words[1];
				
				if(KeyEn.equals(KeyEnT)) {
				
				
				System.out.println(line);
                
				}
            }
			
			
					reader.close();
					
				}
		
		 catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}
        

}








