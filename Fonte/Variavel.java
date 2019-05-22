class Variavel{

	private String name;
	private double value;

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

	public void imprimeName(){
		System.out.println(this.name);
	}

	public void imprimeValue(){
		System.out.println(this.value);	
	}
}