class Interpreta{

	private Entrada[] texto;

	public void Start(){
		for(i=0;i<texto.length();i++){
			if(texto[i] == "m" && texto[i+1] == "a" && texto[i+2] == "i" && texto[i+3] == "n"){
				ok = true;
			}
			else{println("ERRO");}
		}
	}

	public int countLines(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if{texto[i] == "\n"}{
					int cont++;
					return cont;
				}
			}
		}
	}

	public void findVariavel(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "="){
					/*Preciso achar algo que faca minha string andar pra tras ate achar um
					 espaço em branco e guardar tudo q achar nesse percurso*/
					 a.setNomeV();
					 /*Preciso achar algo que faca minha string andar pra frente até achar
					  um ; ou um operador matematico*/
					 a.setValorV();
				}	
			}
		}
	}

	public void findOperation(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "+"){
					/*Preciso de algo que ande a string pra tras ate achar um numero
					 e guardar esse valor, o mesmo pra frente*/
					a.soma(getValorV(), getValorV());
				}
				if(texto[i] == "-"){
					/*Preciso de algo que ande a string pra tras ate achar um numero
					 e guardar esse valor, o mesmo pra frente*/
					a.sub(getValorV(), getValorV());
				}
				if(texto[i] == "*"){
					/*Preciso de algo que ande a string pra tras ate achar um numero
					 e guardar esse valor, o mesmo pra frente*/
					a.mult(getValorV(), getValorV());	
				}
				if(texto[i] == "/"){
					/*Preciso de algo que ande a string pra tras ate achar um numero
					 e guardar esse valor, o mesmo pra frente*/
					a.div(getValorV(); getValorV());
				}
			}
		}
	}]
 	
 	/*Talvez eu use palavras chave para os nomes reservados mas ainda tenho que aprender
 	como trabalhar melhor com as strings*/
	public void findCondicao(){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(texto[i] == "s" && texto[i+1] == "e"){
					/*Preciso de um metodo da classe condicao para executar o if*/
				}
				if(texto[i] == "s" && texto[i+1] == "n"){
					/*Preciso de um metodo da classe condicao para executar o else*/
				}
			}
		}
	}

	public void findloop(){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(texto[i] == "l" && texto[i+1] == "p"){
					/*Preciso de um metodo da classe iteracao para executar o laço*/
				}
			}
		}
	}

	public void findError(){
		while(ok == true){
			for(i=0;<texto.lenght();i++){
				if(texto[i] == "\n"){
					if(texto[i-1] == ";"){
						funciona == true;
					}else{(funciona == false); println("ERROR LINHA "countLines());}
				}

			}
		}
	}
}// Revisado por Fernando
