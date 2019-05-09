import java.util.Scanner;
import java.io.IOException;

class Linguala{

	public static void main(String args[]) throws IOException{
		

		Scanner s = new Scanner(System.in);
		String file = s.nextLine();
		Entrada open = new Entrada();
		Interpreta start = new Interpreta(open.read(file));
		start.start();
		start.countLines();
		start.findVariavel();
		start.findOperation();


	}
			
}