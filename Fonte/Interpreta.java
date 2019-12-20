/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
	private String[] linha = new String[500];
	private Matematica math = new Matematica();
	private Cond condicional = new Cond();
	private Fila fila = new Fila();
	private Saida out = new Saida();
	private Variavel var = new Variavel();
	private char[] caracteres = null;
	
	public Interpreta(){

	}

	public void start(String s[]){
		
		for(int i=0; i<=s.length; i++){
			
			this.linha[i] = s[i];
			
			if(this.linha[i].contains("@print") == false){
				this.linha[i] = this.linha[i].replaceAll(" ","");
            	this.linha[i] = this.linha[i].replaceAll("\t","");
			}
			
			this.caracteres = this.linha[i].toCharArray();
			
			if(this.caracteres != null){
				
				/* Encontra palavra chave @print */
				if(this.linha[i].contains("@print") == true){
					out.analisePrint(this.caracteres);
				}
				
				/*Econtra palavra chave @var */
				if(this.linha[i].contains("@var") == true){
					var.analiseVar(this.caracteres);
				}
			}
		}
		
		/*
		int i=0, k=0, j=0, v=0;
		String[] yes = new String[20];
		String aux;
		Double v1 =0.0, v2 =0.0;
		String[] check = new String[500];*/

       	/*Print apenas para testar a funcionalidade
       	for(i=0; caracteres[i] != null; i++){
       		System.out.println(caracteres[i]+"\n");
			j++;
			System.out.println(j);
       	}*/

       	//retira os espaços, menos em linhas que tem imprime
       /* for(i=0; linha[i] != null; i++){
            if(this.linha[i].contains("@print")==false) {
                linha[i]=linha[i].replaceAll(" ","") ;
                linha[i]=linha[i].replaceAll("\t","") ;
            }
        }
        
        System.out.println("**********************");*/
		/*
        for(i=0;i<this.linha.length;i++){
			if(this.linha[i] != null){*/
				/*Encontra palavra chave @print*/
				/*if(this.linha[i].contains("@print")==true){
					e.analisePrint(this.linha[i]);
				}*/
		/*Encontra variaveis
				if(this.code[i].equals("@var")){
					i++;
					aux = this.code[i];
					var[v].setName(aux);
					i++;
					
					//Adiciona valor a variavel
					if(this.code[i].equals("=")){
						i++;
						v1 = Double.parseDouble(this.code[i]);
						var[v].setValue(v1);
					}
					f.setFila(var[v].getName(), var[v].getValue());
				}
				//Encontra operações
				if(this.code[i].equals("+") || 
					this.code[i].equals("-") ||
					this.code[i].equals("*") ||
					this.code[i].equals("/") ||
					this.code[i].equals("%")){
					i-=3;
					String auxNvarX = this.code[i];
					i+=3;
					aux = this.code[i];
					i--;
					if(f.checkFila(this.code[i])){
						v1 = f.getFila(this.code[i]);  
					}
					else{
						v1 = Double.parseDouble(this.code[i]);
					}
					i+=2;
					if(f.checkFila(this.code[i])){
						v1 = f.getFila(this.code[i]); 
					}
					else{
						v2 = Double.parseDouble(this.code[i]);
					}
					var[v].setValue(m.mat(v1, v2, aux));
					var[v].setName(auxNvarX);
					f.setFila(var[v].getName(), var[v].getValue());
				}	
				//Encontra a condição if
				if(this.code[i].equals("@if")){
					i++;
					if(this.code[i] == this.var[i].getName()){
						v1 = this.var[i].getValue();
					}
					else{
						System.out.println("ERRO @var não declarada linha ->");
					}
					i++; 
					aux = this.code[i];
					i++;
					if(this.code[i] == this.var[i].getName()){
						v2 = this.var[i].getValue();
					}
					else{
						System.out.println("ERRO @var não declarada linha ->");
					}
					while(y.se(v1, v2, aux)){
						//i++;
						if(this.code[i].equals("{")){
							for(i=0;this.code[i] == "}";i++){
								check[i] += code[i];
							}
							Interpreta x = new Interpreta();
							x.start(check);
						}
						else{
							System.out.println("ERRO '{' linha -> ");
						}
						break;
					}
				}
			//Encontra laço de iteração
				if(this.code[i].equals("@loop")){
					i++;
					while(this.code[i] != ";"){
						if(this.code[i] == this.var[i].getName()){
							v1 = this.var[i].getValue();
						}
						else{
							v1 = Double.parseDouble(this.code[i]);
						}
					}
					while(this.code[i] != "}"){
						for(i=0;i<v1;i++){
							check[i] = code[i];
						}
						Interpreta x = new Interpreta();
							x.start(check);
					}
				}*/
			/*}
		}*/

	}
}