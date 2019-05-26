package trabjava;
public class memoria {
    Variavel[] var;
    int ult;
	
	public memoria(){
		var = new Variavel[500];
		ult = 0;
	}
	
	public double verVar(String a){
            int i ;
            for(i = 0; i < ult; i++){
		if((var[i].getName()).equals(a)){
                    return var[i].getValue();
		}
            }
        return 1;
	}
	
	public boolean atualizaVar(String a, double valor){
            int i;
            for(i = 0; i < ult; i++){
			if(var[i].getName().equals(a)){
				var[i].setValue(valor);
				return true;
			}
		}
		var[i] = new Variavel();
                var[i].setValue(valor);
                var[i].setName(a);
		ult++;
		return false;
	}
}
