class Interpreta{

	private Entrada[] texto;
	private String checkN;
	private double checkV1, checkV2;
	private boolean ok;
	private int i, cont;
	private String condicao1 = "se";
	private String condicao2 = "senao";
	private String iteracao = "loop";


	public Interpreta(){
		this.texto = new Interpreta();
		this.texto = new Matematica();
		this.texto = new Variavel();
		this.texto = new Entrada();
		this.texto = new Saida();

	}

	public void Start(){
		for(i=0;i<texto.length();i++){
			if(this.texto.equals("main")){
				ok = true;
			}
			else{println("ERRO");}
		}
	}

	public int countLines(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "\n"){
					cont++;
					return cont;
				}
			}
		}
	}

	public void findVariavel(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "="){
					while(texto[i] != "\n"){
						checkN += texto[i-1];
						StringBuffer checkN += new StringBuffer(texto[i-1]);
						i--;
					}
					this.setNomeV(checkN.reverse());
					if(texto[i] == ";"){
						checkV1 = texto[i-1];
						this.setValorV(checkV1);
					}	 
				}	
			}
		}
	}

	public void findOperation(){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "+"){
					checkV1 = texto[i-1];
					checkV2 = texto[i+1];
					this.soma(checkV1, checkV2);
				}
				if(texto[i] == "-"){
					checkV1 = texto[i-1];
					checkV2 = texto[i+1];
					this.sub(checkV1, checkV2);
				}
				if(texto[i] == "*"){
					checkV1 = texto[i-1];
					checkV2 = texto[i+1];
					this.mult(checkV1, checkV2);	
				}
				if(texto[i] == "/"){
					checkV1 = texto[i-1];
					checkV2 = texto[i+1];
					this.div(checkV1, checkV2);
				}
			}
		}
	}

	public void findCondicao(){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(this.texto.equals(condicao1)){
					/*Preciso de um metodo da classe condicao para executar o if*/
				}
				if(this.texto.equals(condicao2)){
					/*Preciso de um metodo da classe condicao para executar o else*/
				}
			}
		}
	}

	public void findloop(){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(this.texto.equals(iteracao)){
					/*Preciso de um metodo da classe iteracao para executar o laço*/
				}
			}
		}
	}

	public void findError(){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(texto[i] == "\n"){
					if(texto[i-1] != ";"){
						ok = false;
						println("ERROR LINHA "+countLines());
					}
				}

			}
		}
	}

	public String findPrint(){

	}

	public void FindScann(String s){

	}
}