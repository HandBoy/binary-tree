package tree;

public class Node implements Comparable{
	protected Node pai;
	protected Node esquerda;
	protected Node direita;
	protected int chave;
	protected String palavra;
	protected int acao;	

	public Node(int chave, String palavra) {
		super();
		this.pai = null;
		this.esquerda = null;
		this.direita = null;
		this.palavra = palavra;	
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
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
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
			stBuilder.append(this.getPai().getPalavra()); 
		}	

		stBuilder.append(", " + this.chave );	
		
		if(this.getEsquerda() instanceof Nill ){
			stBuilder.append(", NILL"); 
		} else {
			stBuilder.append(", " + this.getEsquerda().getPalavra()); 
		}
		
		if(this.getDireita() instanceof Nill ){
			stBuilder.append(", NILL "); 
		} else {
			stBuilder.append(", " + this.getDireita().getPalavra()); 
		}
		stBuilder.append(")");
		
		return stBuilder.toString();		
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.palavra.compareToIgnoreCase((String) o) > 0)
			return 1;
		else if(this.palavra.compareToIgnoreCase((String) o) < 0)
			return -1;
		else
			return 0;
	}
	
	public String toString(){
		return this.palavra;
	}
	
}
