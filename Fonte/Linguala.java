import java.util.Scanner;

class Linguala{

	public static void main(String args[]) throws IOException{
		
		public String file;
		public Interpreta start;

		Scanner file = new Scanner(System.in);
		Entrada.read(file);
		Interpreta start = new Interpreta(file);
		start.Interpreta.start(file);
		start.Interpreta.countLines(file);
		start.Interpreta.findVariavel(file);
		start.Interpreta.findOperation(file);
		start.Interpreta.findCondicao(file);
		start.Interpreta.findLoop(file);
		start.Interpreta.findError(file);
		start.Interpreta.findPrint(file);
		start.Interpreta.findScan(file);


	}
			
}