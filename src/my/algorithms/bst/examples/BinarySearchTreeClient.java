package my.algorithms.bst.examples;

public class BinarySearchTreeClient {
	
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTreeImpl();
		int[] array = {50,40,44,48,30,20,60,70,80,55};
		for (int i : array) {
			bst.insert(i);
		}

		bst.inOrder();	
	}
}
