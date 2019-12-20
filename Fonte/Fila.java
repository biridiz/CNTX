class Fila{

	private String[] name = new String[100];
	private double[] value = new double[100];
	private int i=0;

	public Fila(){
		for(int k=0; k<this.name.length; k++){
			this.name[k] = new String();
		}
	}

	public void setFila(String s, double v){ //-> Falta garantir que se ocorrer substituicao de valor
		for(int j=0; j<=i; j++){
			if(this.name[j].equals(s)){
				this.name[j] = s;
				this.value[j] = v;
				break;
			}
			else{
				if(i!= 0){
					i++;
				}
				this.name[i] = s;
				this.value[i] = v;
				break;
			}
		}
		System.out.println(this.name[i]);
		System.out.println(this.value[i]);
		System.out.println(i);

	}

	public boolean checkFila(String s){
		boolean ok = false;
		for(int j=0; j<this.name.length; j++){
			if(this.name[j].equals(s)){
				ok = true;
			}
		}
		return ok;
	}

	public double getFila(String s){ //-> Talvez aqui falte algo
		double aux = 0.0;
		for(int j=0; j<this.name.length; j++){
			if(this.name[j].equals(s)){
				aux = this.value[j];
			}
		}
		return aux;
	}
}	