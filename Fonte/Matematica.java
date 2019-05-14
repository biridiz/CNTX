class Matematica{
	
	private Variavel[] var;

	public double mat(double a, double b, String c){
		if(c == "+"){
			return(a+b);
		}
		else if(c == "-"){
			return(a-b);
		}
		else if(c == "*"){
			return(a*b);
		}
		else if(c == "/"){
			return(a/b);
		}

		return a;
	}

	
}