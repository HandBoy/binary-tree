import tree.BinaryTree;
import tree.Nill;
import tree.Node;
import tree.ToolsBinaryTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		ToolsBinaryTree tools = new ToolsBinaryTree();

		Node node = new Node(15);
		tools.treeInsert(tree, node);
		node = new Node(18);
		tools.treeInsert(tree, node);
		node = new Node(17);
		tools.treeInsert(tree, node);
		node = new Node(20);
		tools.treeInsert(tree, node);
		node = new Node(6);
		tools.treeInsert(tree, node);
		node = new Node(3);
		tools.treeInsert(tree, node);
		node = new Node(7);
		tools.treeInsert(tree, node);
		node = new Node(2);
		tools.treeInsert(tree, node);
		node = new Node(4);
		tools.treeInsert(tree, node);
		node = new Node(13);
		tools.treeInsert(tree, node);
		node = new Node(9);
		tools.treeInsert(tree, node);
		
		System.out.println("Menor elemento: " + tools.treeMinimum(tree.getRaiz()));
		System.out.println("Maior elemento: " + tools.treeMaximum(tree.getRaiz()));
		
		Node busca = tools.treeSearch(tree.getRaiz(), 20);
		if(busca instanceof Nill){
			System.out.println("Não encontrado");
		} else {
			System.out.println(busca.details());
		}
		
		busca = tools.treeSearch(tree.getRaiz(), 55);
		if(busca instanceof Nill){
			System.out.println("Não encontrado");
		} else {
			System.out.println(busca.details());
		}
		
		//tools.inOrderTree(tree.getRaiz());
		busca = tools.treeSearch(tree.getRaiz(), 15);
		System.out.println("Sucessor: " + tools.treeSucessor(busca));
		busca = tools.treeSearch(tree.getRaiz(), 13);
		System.out.println("Sucessor: " + tools.treeSucessor(busca));
		
	}

}
