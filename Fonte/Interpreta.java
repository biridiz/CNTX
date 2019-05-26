package trabjava;

import java.util.ArrayList;
import java.util.Scanner;

/*Esta classe Interpreta o arquivo de entrada*/
class Interpreta{

	/*Declaração de variaveis*/
    private String[] code = new String[2000];
    private Matematica m = new Matematica();
    private Cond y = new Cond();
    private Variavel[] var;
    private String[] linha;
    private boolean ok = true;
    memoria mem;
    private ArrayList<String> codigo = new ArrayList<String>();

    private String[] pilha;
    private Scanner s;
    private int p;
	public saida sair;
    
	public Interpreta(){
		this.var = new Variavel[200];
		s=new Scanner(System.in);
		mem = new memoria();
		sair = new saida();
	}

	public void start(String s[]){
		this.linha = s;
		int i=0, k=0, j=0, q = 0;;
		String[] yes = new String[20];
		String aux;
		Double v1 =0.0, v2 =0.0;
		String[] check = new String[500];

		/*Split das linhas para vetor de Strings*/
       	do{
       		yes = linha[i].split(" ");
       		for(k=0;k<yes.length;k++){
       			code[j] = yes[k];
       			j++;
       		}
       		i++;
       	}
       	while(linha[i] != null);

        //Adiciona Tudo em uma ArrayList sem as posições NULL
       	for(i=0;i<code.length;i++){
       		if(code[i] != null){
                        codigo.add(code[i]);  
       		}
       	}
        //Gambiarra colocar tudo em um vetor sem nenhum null
        String[] gamb = new String[codigo.size()];
        for(int ppp = 0; ppp < codigo.size(); ppp++){
            gamb[ppp] = codigo.get(ppp);        
        }
        codigo.clear();
        this.verifica(gamb);
        /* verifica se imprime todas strings
        int ii;
	for(ii = 0; ii < gamb.length; ii++){
            System.out.println(gamb[ii]);
            }*/
	}
	
	public void verifica(String[] a){
            int i;
            for(i=0; i < a.length; i++){
			a[i] = a[i].replace("@if","1");
			a[i] = a[i].replace("@endf","2");
			a[i] = a[i].replace("@while","3");
			a[i] = a[i].replace("@endw","4");
			a[i] = a[i].replace("@var","5");
			a[i] = a[i].replace("@print","p");
			a[i] = a[i].replace(";",";");
			a[i] = a[i].replace("@pegar","g");
		}
		int aux;
            for(i=0; i < a.length; i++){
                char p = a[i].charAt(0);
				int aux0 = i;
				int aux1 = 0;
				int aux2 = 0;
				switch(p){
						case'p':
                                                   
						while(!a[aux0].equals(";")){
                                                        System.out.println("entrou");
                                                        aux0++;
							aux1++;
						}
						String[] temp = new String[aux1];
						for(aux0 = aux0; aux0 < temp.length; aux0++){
							temp[aux2] = a[aux0];
						}
                                                
						//sair.imprime(temp);
						break;
				}
            }
	}
	/*
	
	
        for(i=0;i<gamb.length;i++){
            //Encontra palavra chave @print
            if(gamb[i].equals("@print")){ 
                int d = i + 1;
                while(!gamb[d].equals(";")) {
                    System.out.printf(gamb[d]+' ');
                    d++; 
                }
                System.out.print("\n");
            }
            //Encontra palavra chave var
            if(gamb[i].equals("@var")){  
                    i++;
                    aux = gamb[i];
                    var[q].setName(aux);
                    i++;
                    //Adiciona valor a variavel
                    if(gamb[i].equals("=")){
                        i++;
                        v1 = Double.parseDouble(gamb[i]);
                        var[q].setValue(v1);
                        
                        i++;
                         // ou tem um + ou ;
                        //System.out.println(var[q].getName()); //<- Só para teste
                        //System.out.println(var[q].getValue()); //<-Só para teste
                        double resul = m.verifica(gamb, i);
                        var[q].setValue(resul);
                            i++;
                            System.out.println(gamb[i]);

                        }
                         //   System.out.println(var[q].getName()); //<- Só para teste
                          //  System.out.println(var[q].getValue()); //<-Só para teste
                        
                    
                        if(";".equals(gamb[i])){
                            i++;
                        }
                
                }
                    else{
                        var[q].setValue(0.0);  
                    }
                    q++;
            }
	
	

	//Encontra variaveis
	for(i=0;i<codigo.size();i++){
		
            }
	

		for(i=0;i<this.code.length;i++){
			if(this.code[i] != null){
				//Encontra operação de soma
				if(this.code[i].equals("+")){
					aux = this.code[i];
					i--;
					v1 = Double.parseDouble(this.code[i]);
					i+=2;
					v2 = Double.parseDouble(this.code[i]);
					var[k].setValue(m.mat(v1, v2, aux));
					//System.out.println(var[k].getValue());
				}

				//Encontra operação de subtração
				if(this.code[i].equals("-")){
					aux = this.code[i];
					i--;
					v1 = Double.parseDouble(this.code[i]);
					i+=2;
					v2 = Double.parseDouble(this.code[i]);
					var[k].setValue(m.mat(v1, v2, aux));
					//System.out.println(var[k].getValue());
				}

				//Encontra operação de multiplicação
				if(this.code[i].equals("*")){
					aux = this.code[i];
					i--;
					v1 = Double.parseDouble(this.code[i]);
					i+=2;
					v2 = Double.parseDouble(this.code[i]);
					var[i].setValue(m.mat(v1, v2, aux));
					//System.out.println(var[k].getValue());
				}

				//Encontra operação de divisão
				if(this.code[i].equals("/")){
					aux = this.code[i];
					i--;
					v1 = Double.parseDouble(this.code[i]);
					i+=2;
					v2 = Double.parseDouble(this.code[i]);
					var[i].setValue(m.mat(v1, v2, aux));
					//System.out.println(var[k].getValue());
				}
			}
		}

		for(i=0;i<this.code.length;i++){
			if(this.code[i] != null){
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
			}
		}

		Encontra laço de iteração
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
		}
	}
}*/
}