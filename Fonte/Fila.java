class Fila{

	private String[] name = new String[100];
	private double[] value = new double[100];
	private int i;

	public Fila(){
		for(int k=0; k<this.name.length; k++){
			this.name[k] = new String();
		}
	}

	public void setFila(String s, double v){
		this.name[i] = s;
		this.value[i] = v;
		System.out.println("\n"+this.name[i]); //-> (teste)Está funcionando
		System.out.println(this.value[i]); //-> (teste)Está funcionando 
		i++;
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