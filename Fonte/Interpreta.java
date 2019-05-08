/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
	private String texto;
	private String checkN, s;
	private String checkV1, checkV2;
	private boolean ok;
	private int i, cont;
	private double[] valorV;
	private String[] nomeV; 
	private double[] resul;

	/*Construtor da classe*/
	public Interpreta(String s){
		valorV = new double[500];
		nomeV = new String[500];
		resul = new double[500];
		this.texto = s;
	}

	/*Este metodo chequa se a palavra "main" está no arquivo para poder iniciar*/
	public void Start(){
		for(i=0;i<this.texto.length();i++){
			if(this.texto.equals("main")){
				ok = true;
			}
			else{
				System.out.println("ERRO");
			}
		}
	}

	/*Este método conta o número de linhas*/
	public int countLines(){
		while(ok){
			for(i=0;i<texto.length();i++){
				if(texto.charAt(i) == '\n'){
					cont++;
					return cont;
				}
			}
		}
	}

	/*Este método identica as variaveis no texto e armazena seu nome e valor*/
	public void findVariavel(){
		while(ok){
			for(i=0;i<this.texto.length();i++){
				if(texto.charAt(i) == '='){
					while(texto.charAt(i) != ' '){
						i--;
						checkN.charAt(i) += texto.charAt(i);
						s = new StringBilder(checkN).reverse().toString(); //-> aqui tem um erro, achar outro jeito
						nomeV[i] = s;									     // de inverter a String
					}

					if(texto.charAt(i) == ';'){
						checkV1 = texto.charAt(i-1);
						valorV[i] = Double.parseDouble(checkV1);
					}	 
				}	
			}
		}
	}

	/*Este método identifica as operações matematicas e já as calcula*/
	public void findOperation(){
		while(ok){
			for(i=0;i<this.texto.length();i++){
				if(texto.charAt(i) == '+'){
					checkV1 = texto.charAt(i-1);
					valorV[i] = Double.parseDouble(checkV1);
					checkV2 = texto.charAt(i+1);
					valorV[i+1] = Double.parseDouble(checkV2);
					resul[i] = (valorV[i] + valorV[i+1]);
				}
				if(texto.charAt(i) == '-'){
					checkV1 = texto.charAt(i-1);
					valorV[i] = Double.parseDouble(checkV1);
					checkV2 = texto.charAt(i+1);
					valorV[i+1] = Double.parseDouble(checkV2);
					resul[i] = (valorV[i] - valorV[i+1]);
				}
				if(texto.charAt(i) == '*'){
					checkV1 = texto.charAt(i-1);
					valorV[i] = Double.parseDouble(checkV1);
					checkV2 = texto.charAt(i+1);
					valorV[i+1] = Double.parseDouble(checkV2);
					resul[i] = (valorV[i] * valorV[i+1]);	
				}
				if(texto.charAt(i) == '/'){
					checkV1 = texto.charAt(i-1);
					valorV[i] = Double.parseDouble(checkV1);
					checkV2 = texto.charAt(i+1);
					valorV[i+1] = Double.parseDouble(checkV2);
					resul[i] = (valorV[i] / valorV[i+1]);				}
				}
			}
		}
	}
