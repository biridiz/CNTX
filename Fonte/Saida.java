class Saida{

	public double print_var;
	public String print_texto = new String();

	public Saida analisePrint(char[] c, Variavel[] v, String s){

		for(int j=0; j<c.length; j++){
			if(c[j] == '('){
				j++;
				if(c[j] == '"'){
					j++;
					while(c[j] != '"'){
						this.print_texto += c[j];
						j++;	
					}
				}
			}
		}

		for(int i=0; i<v.length; i++){
			if(s.contains(v[i].getName())){
				for(int k=0; k<c.length; k++){
					if(c[k] == '+'){
						this.print_var = v[i].getValue();
						break;
					}
				}
				break;
			}
		}

		return this;
	}
}