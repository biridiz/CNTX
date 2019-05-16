/**
 *	Autor: Ricardo Parizotto
 *   E-mail: ricardo.dparizotto@gmail.com
 *
 *	Esta classe é a implementação de uma pilha simples.
 *	Ela auxilia na execução dos Desvios incondicionais e condicionais da linguagem.
 *
**/	

class Pilha{
	private int[] vec;
	private int topo;

	public Pilha(){
		vec=new int[1000];
		topo=-1;
	}

	public void push(int n){
		this.topo=this.topo +1;
		this.vec[this.topo]=n;
	}

	public void pop(){
		if(topo!=-1)		
			this.topo=this.topo -1;
	}
	public int topo(){
		return (this.topo!=-1)? this.vec[topo]:0;
	}
	
	public boolean vazio(){
		return (this.topo==-1)? false:true;
	}
}
