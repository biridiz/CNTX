class Fila{

	private String[] string;
	private boolean top;
	private boolean next;

	public Fila(){
		this.string = new String[200];
	}

	public boolean setFila(String[] s, int t){
		String[] aux = new String[30];
		for(int i=0;i<s.length;i++){
			aux[i] = s[i];
		}
		if(t == 0){
			top = true;
			string = aux;
		}
		else{
			top = false;
			next = true;
		}
		return true;
	}

	public String[] getFila(String[] s){
		for(int i=0;i<s.length;i++){
			if(top == true){
				if(this.string[i] == s[i]){
					top = false;
				}
			}
		}
		return string;
	}
}	