class Fila{

	private String[] string = new String[200];
	private double[] valor = new double[200];
	private int i = 0;

	public Fila(){
	}

	public void setFila(String s, double v){
		this.string[i] = s;
		this.valor[i] = v;
		i++;
	}

	public double getFila(String s){
		double aux = 0.0;
		for(int j=0; j<string.length; j++){
			if(this.string[j].equals(s)){
				aux = this.valor[i];
			}
		}
		return this.valor[i];
	}
}	