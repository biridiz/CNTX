import java.util.Scanner;
import java.io.IOException;

class Linguala extends Interpreta{

	public static void main(String args[]) throws IOException{
		

		Scanner file = new Scanner(System.in);
		Entrada open = new Entrada();
		Interpreta start = new Interpreta(open.read(file));
		start.start();
		start.countLines();
		start.findVariavel();
		start.findOperation();


	}
			
}