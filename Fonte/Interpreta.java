/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
	private String[] linha = new String[2000];
	private Matematica m = new Matematica();
	private Cond y = new Cond();
	private Fila f = new Fila();
	private Saida e = new Saida();
	private Variavel[] var;
	//private String[] linha;
	
	public Interpreta(){
		this.var = new Variavel[2];
		for(int j=0; j<var.length;j++){
			this.var[j] = new Variavel();
		}
	}

	public void start(String s[]){

		this.linha = s;
		int i=0, k=0, j=0, v=0;
		String[] yes = new String[20];
		String aux;
		Double v1 =0.0, v2 =0.0;
		String[] check = new String[500];

		/*Split das linhas para vetor de Strings
       	do{
       		yes = linha[i].split(" ");
       		for(k=0;k<yes.length;k++){
       			code[j] = yes[k];
       			j++;
       		}
       		i++;
       	}
       	while(linha[i] != null);
       	*/

       	/*Print apenas para testar a funcionalidade*/
       	for(i=0; linha[i] != null; i++){
       		System.out.println(linha[i]);
       	}

       	//retira os espaços, menos em linhas que tem imprime
        for(i=0; linha[i] != null; i++){
            if(this.linha[i].contains("@print")==false) {
                linha[i]=linha[i].replaceAll(" ","") ;
                linha[i]=linha[i].replaceAll("\t","") ;
            }
        }
        
        System.out.println("**********************");

        for(i=0;i<this.linha.length;i++){
			if(this.linha[i] != null){
				/*Encontra palavra chave @print*/
				if(this.linha[i].contains("@print")==true){
					e.analisePrint(this.linha[i]);
				}
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
			}
		}

	}
}