package my.algorithms.bst.examples;

public interface BinarySearchTree {

	public boolean lookUp(int value);
	
	public void insert(int value);
	
	public int minValue();
	
	public int size();
	
	public int maxDepth();
	
	public void postOrder();
	
	public void preOrder();
	
	public void inOrder();
	
	/**
	 * Checks if the tree has given sum path from root to leaf. 
	 * Check http://cslibrary.stanford.edu/110/BinaryTrees.pdf problem 7 for reference to the question.
	 */
	public boolean hasPathSum(int value);
	
	public void mirrorBinaryTree();
	
	public void doubleBinaryTree();
	
	//public boolean sameTree(BinarySearchTree tree);

}
