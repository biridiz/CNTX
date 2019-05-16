class Cond{

	//private Variavel[] var;
	private boolean ok;

	public boolean se(double a, double b, String c){

		if(c == "=="){
			if(a == b){
				ok = true;
			}
			else{
				ok = false;
			}
			return ok;
		}

		if(c == "<"){
			if(a < b){
				ok = true;
			}
			else{
				ok = false;
			}
			return ok;
		}

		if(c == ">"){
			if(a > b){
				ok = true;
			}
			else{
				ok = false;
			}
			return ok;
		}

		if(c == "!="){
			if(a != b){
				ok =true;
			}
			else{
				ok = false;
			}
			return ok;
		}

		if(c == "<="){
			if(a <= b){
				ok = true;
			}
			else{
				ok = false;
			}
			return ok;
		}

		if(c == ">="){
			if(a >= b){
				ok = false;
			}
			else{
				ok = false;
			}
			return ok;
		}
	
	return ok;
	}
}