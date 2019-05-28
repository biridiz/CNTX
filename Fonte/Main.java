import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) throws IOException{

		try{
            int i = 0, k = 0, j = 0;
            File f;
            Scanner s;
            Interpreta w;
            String[] linha = new String[200];
            
            f = new File(args[0]);
            s = new Scanner(f);
            w = new Interpreta();

            while(s.hasNext()){
                linha[i] = s.nextLine();
                i++;
            }

            w.start(linha);
        }
        
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}			
}