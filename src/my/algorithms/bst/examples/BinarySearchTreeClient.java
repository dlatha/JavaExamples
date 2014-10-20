package my.algorithms.bst.examples;

public class BinarySearchTreeClient {
	
	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTreeImpl();
		int[] array = {4,6,5,2,3,1,8,9,10,34};
		for (int i : array) {
			bst.insert(i);
		}

//		bst.getRootToLeafPaths();
		bst.getAllDepthsFromRootToLeaf();
		System.out.println(bst.maxDepth());
	}
}
