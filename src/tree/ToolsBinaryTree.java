package tree;

public class ToolsBinaryTree {
	public void treeInsert(BinaryTree tree, Node zNode){
		Node yNode = new Nill();
		Node xNode = tree.raiz;
		while (!(xNode instanceof Nill)){
			yNode = xNode;
			if (zNode.getChave() < xNode.getChave()){
				xNode = xNode.getEsquerda();
			} else {
				xNode = xNode.getDireita();
			}
		}

		zNode.setPai(yNode);
		zNode.setEsquerda(tree.getNill());
		zNode.setDireita(tree.getNill());

		if (yNode instanceof Nill) {
			tree.setRaiz(zNode);
		} else if (zNode.getChave() < yNode.getChave()){
			yNode.setEsquerda(zNode);
		} else {
			yNode.setDireita(zNode);
		}	


	}

	public Node treeMinimum(Node node){
		while (!(node.getEsquerda() instanceof Nill)){
			node = node.getEsquerda();
		}			
		return node;
	}

	public Node treeMaximum(Node node){
		while (!(node.getDireita() instanceof Nill)){
			node = node.getDireita();
		}			
		return node;
	}

	public Node treeSearch(Node node, int num){
		while(!(node instanceof Nill) && num != node.getChave()){
			if(num < node.getChave())
				node = node.getEsquerda();
			else 
				node = node.getDireita();
		}

		return node;
	}

	//Se a subárvore direita do nó x for não vazia, então o sucessor de x
	// é exatamente o nó da extrema esquerda na subárvore direita do 
	//Se a subárvore direita do nó x for vazia, então o y é o ancestral
	//mais baixo de x cujo filho à esquerda é também um ancestral de x.
	public Node treeSucessor(Node xNode){
		if(!(xNode.getDireita() instanceof Nill))
			return treeMinimum(xNode.getDireita());

		Node yNode = xNode.getPai();
		while(!(yNode instanceof Nill) && xNode == yNode.getDireita()){
			xNode = yNode;
			yNode = yNode.getPai();
		}
		return yNode;
	}

	public Node treePreSucessor(Node xNode){
		if(!(xNode.getEsquerda() instanceof Nill))
			return treeMaximum(xNode.getEsquerda());
		Node yNode = xNode.getPai();
		while(!(yNode instanceof Nill) && xNode == yNode.getEsquerda()){
			xNode = yNode;
			yNode = yNode.getPai();
		}
		return yNode;
	}

	public void inOrderTree(Node node){
		if (!(node instanceof Nill)){
			inOrderTree(node.getEsquerda());
			System.out.println(node.chave);
			inOrderTree(node.getDireita());
		}
	}	

	public void preOrderTree(Node node){
		if (!(node instanceof Nill)){
			System.out.println(node.chave);
			preOrderTree(node.getEsquerda());		
			preOrderTree(node.getDireita());
		}
	}

	public void posOrderTree(Node node){	
		if (!(node instanceof Nill)){
			posOrderTree(node.getEsquerda());		
			posOrderTree(node.getDireita());
			System.out.println(node.chave);
		}
	}

}
