package tree;

public class BinaryTree {
	Node raiz;
	Node nill;
	public BinaryTree(){
		this.nill = new Nill();
		this.raiz = this.nill;
	}
	public Node getRaiz() {
		return raiz;
	}
	public void setRaiz(Node raiz) {
		this.raiz = raiz;
	}
	public Node getNill() {
		return nill;
	}
	public void setNill(Node nill) {
		this.nill = nill;
	}
	
	
}
