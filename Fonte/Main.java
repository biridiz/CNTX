import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

class Main{

	public static void main(String[] args) throws IOException{

		try{
		
		int i = 0;
		File f;
        Scanner s;
        Interpreta w;
        String linha;// = new String[2000];
        //String[] linha = new String[2000];
        char[] letras = new char[100];
        char[] palavra = new char[100];
        String[] code = new String[15];
        //String q;
        
        f = new File(args[0]);
        s = new Scanner(f);
        w = new Interpreta();

        while(s.hasNextLine()) {
            linha = s.nextLine();
            
            for(i=0;i<code.length;i++){
                if(code[i] != null){
                    code[i] = linha;
                    w.start(code);
                }
            }
    
            //code[i] += linha;
            System.out.println(linha);
            System.out.println(code);

            //recebe = linha.split("\n");
            //for(i=0;i<linha.length();i++){
                //code[i] += recebe[i];
            //}
            //int qtd = linha[i].length();
            //letras = linha[i].toCharArray();
            //System.out.println(letras);
            //for(i=0; i<linha.length; i++){
            //	if(linha[i].equals("\n") || linha[i].equals(" ")){
                    //palavra[i] = letras[i];
                    //System.out.print(palavra[i]);
                    //code[i] = linha[i].split(" ");
                    //code = Character.toString(palavra[i]);
              //      System.out.println(code);
                //}
            	//i++;
            //}
        }
        //System.out.println(code);
        
        

        //System.out.println(code);    
        //w.start(code);
		}
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}			
}