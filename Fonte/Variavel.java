class Variavel{

	private String name;
	private double value;
	private boolean top;
	private boolean next;

	public void setName(String n){
		this.name = n;
	}

	public void setValue(double v){
		this.value = v;
	}

	public String getName(){
		return this.name;
	}

	public double getValue(){
		return this.value;
	}

	/*public void memoryVar(String s, double v, int i){
		String[] name = new String[50];
		double[] value = new double[50];
		while(this.name != null){
			int j=i;
			name[j] = this.name;
			value[j] = this.value;
			i++;
		}
	}*/

	public void imprimeVar(String s){
		if(this.name.equals(s)){
			System.out.println(this.value);
		}
	}
	
	//public double findForName(String s){

	//}

}