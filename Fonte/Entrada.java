import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Entrada{

	private String code, linha;

	public static void read(String code) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(code));
        String linha = "";
        while (true){
            if (linha != null){
                System.out.println(linha);
 
            }else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
