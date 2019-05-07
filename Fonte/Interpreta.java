class Interpreta{

	private String texto;
	private String checkN, s;
	private double checkV1, checkV2;
	private boolean ok;
	private int i, cont;
	private String condicao1 = "se";
	private String condicao2 = "senao";
	private String iteracao = "loop";
	private String print = "print";
	private String scan = "scan";


	public Interpreta(String texto){
		this.texto = new Interpreta();
		this.texto = new Matematica();
		this.texto = new Variavel();
		this.texto = new Entrada();
		this.texto = new Saida();

	}

	public void Start(String texto){
		for(i=0;i<texto.length();i++){
			if(this.texto.equals("main")){
				ok = true;
			}
			else{println("ERRO");}
		}
	}

	public int countLines(String texto){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "\n"){
					cont++;
					return cont;
				}
			}
		}
	}

	public void findVariavel(String texto){
		while(ok == true){
			for(i=0;i<texto.length();i++){
				if(texto[i] == "="){
					while(texto[i] != ""){
						checkN += texto[i-1];
						i--;
					}
					s = new StringBilder(checkN).reverse().toString();
					this.setNomeV(s);
					if(texto[i] == ";"){
						checkV1 = texto[i-1];
						this.setValorV(checkV1);
					}	 
				}	
			}
		}
	}

	public void findOperation(String texto){
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

	public void findCondicao(String texto){
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

	public void findloop(String texto){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(this.texto.equals(iteracao)){
					/*Preciso de um metodo da classe iteracao para executar o laço*/
				}
			}
		}
	}

	public void findError(String texto){
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

	public String findPrint(String texto){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(this.texto.equals(print)){

				}
			}
		}
	}

	public void findScann(String texto){
		while(ok == true){
			for(i=0;i<texto.lenght();i++){
				if(this.texto.equals(scan)){

				}
			}
		}
	}
}