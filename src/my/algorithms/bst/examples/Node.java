/**
 * 
 */
package my.algorithms.bst.examples;

/**
 * @author maddy
 *
 */
public class Node{
	
	Node left;
	Node right;
	int data;
	
	public Node(int data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public Node(int data){
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
