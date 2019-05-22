/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
	private String[] code;
	private Variavel[] var;
	private Matematica m = new Matematica();
	private Cond y = new Cond();
	private boolean ok = true;
	
	public Interpreta(String[] s){
		code = new String[s.length];
		this.var = new Variavel[200];
		for(int j=0; j<var.length;j++){
			this.var[j] = new Variavel();
		}
	}

	public void start(String[] code){

		this.code = code;
		int i, k = 0;
		String aux;
		Double v1 =0.0, v2 =0.0;
		String[] check = new String[500];

		while(ok){
			for(i=0;i<this.code.length;i++){
				if(this.code[i] != null){
					/*Encontra palavra chave @print*/
					if(this.code[i].equals("@print")){
						i++;
						while(code[i] != null){
							System.out.print(code[i]+" ");
							i++;
						}
						
						/*if(this.code[i].equals("@var")){
							this.var[i].imprimeValue();
						}
						if(this.code[i].equals("'")){
							i++;
							if(this.code[i] != "'"){
								System.out.println(this.code[i]);
							}
						}*/
						
					}
			/*Encontra variaveis*/
			for(i=0;i<this.code.length;i++){
				if(this.code[i] != null){
					if(this.code[i].equals("@var")){
						i++;
						aux = this.code[i];
						var[k].setName(aux);
						i++;
						
						/*Adiciona valor a variavel*/
						if(this.code[i].equals("=")){
							i++;
							v1 = Double.parseDouble(this.code[i]);
							var[k].setValue(v1);
							//System.out.println(var[k].getName());
							//System.out.println(var[k].getValue());
						}
					}
				}
			}

			for(i=0;i<this.code.length;i++){
				if(this.code[i] != null){
					/*Encontra operação de soma*/
					if(this.code[i].equals("+")){
						aux = this.code[i];
						i--;
						v1 = Double.parseDouble(this.code[i]);
						i+=2;
						v2 = Double.parseDouble(this.code[i]);
						var[k].setValue(m.mat(v1, v2, aux));
						System.out.println(var[k].getValue());
					}

					/*Encontra operação de subtração*/
					if(this.code[i].equals("-")){
						aux = this.code[i];
						i--;
						v1 = Double.parseDouble(this.code[i]);
						i+=2;
						v2 = Double.parseDouble(this.code[i]);
						//this.var[i].setValue(m.mat(v1, v2, aux));
						Double r = v1 - v2;
						System.out.println(r);
					}

					/*Encontra operação de multiplicação*/
					if(this.code[i].equals("*")){
						aux = this.code[i];
						i--;
						v1 = Double.parseDouble(this.code[i]);
						i+=2;
						v2 = Double.parseDouble(this.code[i]);
						//this.var[i].setValue(m.mat(v1, v2, aux));
						Double r = v1 * v2;
						System.out.println(r);
					}

					/*Encontra operação de divisão*/
					if(this.code[i].equals("/")){
						aux = this.code[i];
						i--;
						v1 = Double.parseDouble(this.code[i]);
						i+=2;
						v2 = Double.parseDouble(this.code[i]);
						//this.var[i].setValue(m.mat(v1, v2, aux));
						Double r = v1 /	 v2;
						System.out.println(r);
					}
				}
			}

			for(i=0;i<this.code.length;i++){
				if(this.code[i] != null){
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