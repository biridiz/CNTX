import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

public class Main{

	public static void main(String[] args) throws IOException{

		try{
            int i = 0;
            File f;
            Scanner s;
            Interpreta w;
            String linha;
            String[] code = new String[2000];
            String[] aux = new String[100];
            
            f = new File(args[0]);
            s = new Scanner(f);


            while(s.hasNextLine()){
                linha = s.nextLine();
                for (i=0;i<linha.length();i++) {
                    aux = linha.split(" ");
                    code = aux;  
               }            
            }
            
            for(i=0;i<code.length;i++){
                System.out.println(code[i]);
            }
            w = new Interpreta(code);
            w.start(code);
        }
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}			
}