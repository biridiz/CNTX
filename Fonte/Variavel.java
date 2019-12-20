class Variavel{

	private String name;
	private double value;
	private boolean top;
	private boolean next;

	public void setName(String n){
		this.name = n;
		return;
	}

	public void setValue(double v){
		this.value = v;
		return;
	}

	public String getName(){
		return this.name;
	}

	public double getValue(){
		return this.value;
	}

	public void analiseVar(char[] c){

		String aux = new String();

		for(int j=0; j<=c.length; j++){
			if(c[j] == '='){
				j--;
				while(c[j] != ':'){
					aux += c[j];
					j--;
					if(c[j] == ':'){
						StringBuffer nome = new StringBuffer(aux);
						nome.reverse();
						System.out.println(nome);
						this.encontraValor(nome, c);
						return;
					}	
				}
			}
		}
	}

	public void encontraValor(StringBuffer n, char[] c){

		String aux = new String();

		for(int i=0; i<=c.length; i++){
			aux += c[i];
		}
		
		for(int i=0; i<=c.length; i++){
			if(aux.contais('=')){
				if(c[i] == '='){
					i++;
				}
			}
			else{
				System.out.println("sem valor");
			}
		}
	}

}