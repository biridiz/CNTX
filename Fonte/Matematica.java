package trabjava;

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
			r = a/b;
		}

		return r;
	}
        public double soma(double a, double b){
            return a + b;
        }
        public double divide(double a, double b){
            return a / b;
        }
        public double multiplica(double a, double b){
            return a * b;
        }
        public double subtrai(double a, double b){
            return a - b;
        }
        public double resto(double a, double b){
            return a % b;
        }

	
}