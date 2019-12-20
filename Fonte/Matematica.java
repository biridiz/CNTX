class Matematica{
	
	private Variavel[] var;

	public double mat(double a, double b, String c){
		double r = 0;

		if(c.equals("+")){
			r = a+b;
		}
		else if(c.equals("-")){
			r = a-b;
		}
		else if(c.equals("*")){
			r = a*b;
		}
		else if(c.equals("/")){
			if(a != 0 || b != 0){
				r = a/b;
			}
		}
		else if(c.equals("%")){
			r = a%b;
		}

		return r;
	}

	
}