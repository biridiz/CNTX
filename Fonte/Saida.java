class Saida{

	private String print_var;
	private String print_texto;

	public void analisePrint(char[] c){
		
		for(int j=0; j<c.length; j++){
			if(c[j] == '('){
				j++;
				if(c[j] == '"'){
					j++;
					while(c[j] != '"'){
						System.out.print(c[j]);
						j++;
					}
				}
			}
		}
		System.out.print("\n");
		return;
	}
}