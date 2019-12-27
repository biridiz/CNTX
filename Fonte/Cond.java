class Cond{

	private boolean ok = false;

	public boolean analiseCond(char[] c, Variavel[] v, String s){

		String op = new String();
		double[] cash = new double[3];
		int j = 0;
		
		if(s.contains("==")){
			op = "==";
		}
		else if(s.contains("<")){
			op = "<";
		}
		else if(s.contains(">")){
			op = ">";
		}
		else if(s.contains("!=")){
			op = "!=";
		}
		else if(s.contains("<=")){
			op = "<=";
		}
		else if(s.contains(">=")){
			op = ">=";
		}
		else{
			return ok;
		}

		for(int i=0; i<=v.length; i++){
			if(j >= 2){
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
		ok = this.se(cash[0], cash[1], op);
		return ok;
	}

	public boolean se(double a, double b, String c){

		if(c.equals("==")){
			if(a == b){
				ok = true;
			}
			else{
				ok = false;
			}
		}

		if(c.equals("<")){
			if(a < b){
				ok = true;
			}
			else{
				ok = false;
			}
		}

		if(c.equals(">")){
			if(a > b){
				ok = true;
			}
			else{
				ok = false;
			}
		}

		if(c.equals("!=")){
			if(a != b){
				ok =true;
			}
			else{
				ok = false;
			}
		}

		if(c.equals("<=")){
			if(a <= b){
				ok = true;
			}
			else{
				ok = false;
			}
		}

		if(c.equals(">=")){
			if(a >= b){
				ok = false;
			}
			else{
				ok = false;
			}
		}
	
	return ok;
	}
}