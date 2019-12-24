class Variavel{

	private String name;
	private double value;

	public Variavel(){

	}

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

	public Variavel analiseVar(char[] c){

		String aux = new String();
		double value;

		for(int j=0; j<=c.length; j++){
			if(c[j] == '='){
				j--;
				while(c[j] != ':'){
					aux += c[j];
					j--;
					if(c[j] == ':'){
						StringBuffer nome = new StringBuffer(aux);
						nome.reverse();
						aux = String.valueOf(nome);
						value = this.encontraValor(c);
						this.name = aux;
						this.value = value;
						return this;
					}	
				}
			}
		}
		this.name = "";
		this.value = 0.0;
		return this;
	}

	public double encontraValor(char[] c){

		String aux = new String();
		double value = 0.0;
		
		for(int i=0; i<=c.length; i++){
			if(c[i] == '='){
				i++;
				while(c[i] != ';'){
					aux += c[i];
					i++;
				}
				value = Double.parseDouble(aux);
				return value;
			}
		}
		return value;
	}

}