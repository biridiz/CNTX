package trabjava;
public class saida{
    
    public saida(){
        
    }
    
    public void imprime(String texto){
		String[] str = texto.split("&&");
		for(int i=0; i<str.length; i++){
			str[i] = str[i].trim();
                        System.out.print(str[i]+" ");
			}
		}
}

