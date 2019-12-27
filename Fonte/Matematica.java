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

		for(int i=0; i<=v.length; i++){
			if(j >= 3){
				break;
			}
			else{
				if(v[i] != null){
					if(s.contains(v[i].getName()) == true){
						cash[j] = v[i].getValue();
						j++;
					}
				}
				else{
					break;
				}
			}
		}
		cash[0] = this.math(cash[1], cash[2], op);
		v[0].setValue(cash[0]);
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