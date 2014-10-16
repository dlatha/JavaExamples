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
}
