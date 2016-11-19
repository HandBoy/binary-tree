package tree;

public class ToolsBinaryTree {
	public void treeInsert(Node raiz, Node zNode){
		Node yNode = new Nill();
		Node xNode = raiz;
		while (!(xNode instanceof Nill)){
			yNode = xNode;
			if (zNode.getChave() < xNode.getChave()){
				xNode = xNode.getEsquerda();
			} else {
				xNode = xNode.getDireita();
			}
		}
	}
}
