import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


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
	
	public void delWord(String KeyEn, String fileName){
		my_dict.remove(KeyEn);
	
		Path path = Paths.get(fileName);
		Charset charset = StandardCharsets.UTF_8;
        String content = null;
                    
        try {content = new String(Files.readAllBytes(path), charset);} catch (IOException e2) {e2.printStackTrace();}
         content = content.replaceAll( KeyEn, "");
         try {Files.write(path, content.getBytes(charset));} catch (IOException e2) {e2.printStackTrace();}
         
		
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
	



        

    }








