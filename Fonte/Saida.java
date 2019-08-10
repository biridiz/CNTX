class Saida{

	private String nome;
	private String msg;
	private Fila f = new Fila();
	private int j;

	public void analisePrint(String s){
		for(j = 0; j<s.length(); j++){
			if(s.contains("(") == true && s.contains(")") == true){
				if(s.charAt(j) == '('){
					j++;
					break;
				}
			}
		}
		while(s.charAt(j) != ')'){
			if(s.charAt(j) == '#'){
				j++;
				while(s.charAt(j) != '#'){
					System.out.print(s.charAt(j));
					nome += s.charAt(j);
					if(f.checkFila(nome)) System.out.print(f.getFila(nome));
					j++;
				}
			}	
			System.out.print(s.charAt(j));
			j++;	
		}
	}
}