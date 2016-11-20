package tree;

public class Node{
	protected Node pai;
	protected Node esquerda;
	protected Node direita;
	protected int chave;
	protected int acao;	

	public Node(int chave) {
		super();
		this.pai = null;
		this.esquerda = null;
		this.direita = null;
		this.chave = chave;
	}
	
	public Node() {
		super();		
	}	
	public Node getPai() {
		return pai;
	}
	public void setPai(Node pai) {
		this.pai = pai;
	}
	public Node getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}
	public Node getDireita() {
		return direita;
	}
	public void setDireita(Node direita) {
		this.direita = direita;
	}		
	public int getAcao() {
		return acao;
	}
	public void setAcao(int acao) {
		this.acao = acao;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}

	public String details(){
		StringBuilder stBuilder = new StringBuilder();
		stBuilder.append("(");
		if(this.getPai() instanceof Nill ){
			stBuilder.append("NILL"); 
		} else {
			stBuilder.append(this.getPai().getChave()); 
		}	

		stBuilder.append(", " + this.chave );	
		
		if(this.getEsquerda() instanceof Nill ){
			stBuilder.append(", NILL"); 
		} else {
			stBuilder.append(", " + this.getEsquerda().getChave()); 
		}
		
		if(this.getDireita() instanceof Nill ){
			stBuilder.append(", NILL "); 
		} else {
			stBuilder.append(", " + this.getDireita().getChave()); 
		}
		stBuilder.append(")");
		
		return stBuilder.toString();		
	}
	
	public String toString(){
		return " " + this.chave;
	}
	
}
