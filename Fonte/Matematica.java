class Matematica{

	public void analiseOp(char[] c, Variavel[] v, String s){
		
		char op = ' ';
		double[] cash = new double[3];
		int j = 0;
		
		for(int i=0; i<c.length; i++){
			if(
				c[i] == '+' ||
				c[i] == '-' ||
				c[i] == '*' ||
				c[i] == '/' ||
				c[i] == '%'
			){
				op = c[i];
				break;
			}
		}

		for(int i=0; i<cash.length; i++){
			if(s.contains(v[i].getName())){
				cash[j] = v[i].getValue();
				j++;
			}
		}

		cash[0] = this.math(cash[1], cash[2], op);
		v[0].setValue(cash[0]);
		System.out.println(cash[0]);
		return;
	}

	public double math(double a, double b, char c){
		
		double r = 0.0;

		if(c == '+'){
			r = a+b;
		}
		else if(c == '-'){
			r = a-b;
		}
		else if(c == '*'){
			r = a*b;
		}
		else if(c == '/'){
			if(a != 0 || b != 0){
				r = a/b;
			}
		}
		else if(c == '%'){
			r = a%b;
		}

		return r;
	}	
}