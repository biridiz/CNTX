import java.util.Scanner;
import java.io.*;

class Linguala{

	public static void main(String args[]) throws IOException{
		
		int i = 0;
		File f;
		Scanner s;
		Interpreta w;
		String code[] = new String[2000];

		f = new File(args[0]);
		s = new Scanner(f);
		w = new Interpreta();

		while(s.hasNext()){
			code[i] = s.nextLine();
			i++;
		}

		w.start(code);	

	}
			
}