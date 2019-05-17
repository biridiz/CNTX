/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
	private String[] code;
	//private Interpreta x = new Interpreta();
	private Variavel[] var = new Variavel[200];
	private Matematica m = new Matematica();
	private Cond y = new Cond();
	private boolean ok;
	
	public Interpreta(String[] s){
		code = new String[s.length];
	}

	public void start(String[] code){

		this.code = code;
		int i;
		String aux;
		Double v1 =0.0, v2 =0.0;
		String[] check = new String[500];

		for(i=0;i<this.code.length;i++){
			System.out.println(this.code[i]);
			break;
		}

        /*Confere a palavra main para iniciar o código*/
		for(i=0;i<this.code.length;i++){
			if(this.code[i] != null){
				if(this.code[i].equals("main->")){
					ok = true;
				}
				else{
					System.out.println("***FATAL ERRO***");
					break;
				}
			}
			else{
				System.out.println("***FATAL ERRO***");
				break;
			}
		}

		while(ok){
			for(i=0;i<this.code.length;i++){
				if(this.code[i] != null){
					/*Encontra palavra chave @print*/
					if(this.code[i].equals("@print")){
						i++;
						while(this.code[i] != ";"){
							if(this.code[i].equals("@var")){
								this.var[i].imprimeValue();
							}
							if(this.code[i].equals("'")){
								i++;
								while(this.code[i] != "'"){
									System.out.println(this.code[i]);
								}
							}
						}
					}
					/*Encontra variaveis*/
					if(this.code[i].equals("@var")){
						i++;
						while(this.code[i] != ";" || this.code[i] != "="){
							aux = this.code[i];
							this.var[i].setName(aux);
						}
						/*Adiciona valor a variavel*/
						if(this.code[i] == "="){
							i++;
							v1 = Double.parseDouble(this.code[i]);
							this.var[i].setValue(v1);
						}
					}

					/*Encontra operação de soma*/
					if(this.code[i].equals("+")){
						aux = this.code[i];
						v1 = Double.parseDouble(this.code[i-1]);
						v2 = Double.parseDouble(this.code[i+2]);
						this.var[i].setValue(m.mat(v1, v2, aux));
					}

					/*Encontra operação de subtração*/
					if(this.code[i].equals("-")){
						aux = this.code[i];
						v1 = Double.parseDouble(this.code[i-1]);
						v2 = Double.parseDouble(this.code[i+2]);
						this.var[i].setValue(m.mat(v1, v2, aux));
					}

					/*Encontra operação de multiplicação*/
					if(this.code[i].equals("*")){
						aux = this.code[i];
						v1 = Double.parseDouble(this.code[i-1]);
						v2 = Double.parseDouble(this.code[i+2]);
						this.var[i].setValue(m.mat(v1, v2, aux));
					}

					/*Encontra operação de divisão*/
					if(this.code[i].equals("/")){
						aux = this.code[i];
						v1 = Double.parseDouble(this.code[i-1]);
						v2 = Double.parseDouble(this.code[i+2]);
						this.var[i].setValue(m.mat(v1, v2, aux));
					}

					/*Encontra a condição*/
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
								Interpreta x = new Interpreta(check);
								x.start(check);
							}
							else{
								System.out.println("ERRO '{' linha -> ");
							}
							break;
						}
					}

					/*Encontra laço de iteração*/
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
							Interpreta x = new Interpreta(check);
							x.start(check);
						}
					}
				}
			}
		}
	}
}