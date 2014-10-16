package my.algorithms.bst.examples;

public class BinarySearchTree {

	Node root = null;

	public boolean lookUp(int value) {
		if (root == null) {
			return false;
		} else {
			return lookUp(root, value);
		}
	}

	private boolean lookUp(Node node, int value) {
		if (node.data == value) {
			return true;
		} else if (value < node.data) {
			if (node.left != null) {
				return lookUp(node.left, value);
			}
		} else {
			if (node.right != null) {
				return lookUp(node.right, value);
			}
		}
		return false;
	}

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
		} else {
			insert(root, value);
		}
	}

	private void insert(Node node, int value) {
		if (!lookUp(node, value)) {
			if (value < node.data) {
				if (node.left != null) {
					insert(node.left, value);
				} else {
					node.left = new Node(value);
					System.out.println("left node" + value);
				}
			} else {
				if (node.right != null) {
					insert(node.right, value);
				} else {
					node.right = new Node(value);
					System.out.println("right node" + value);
				}
			}
		}
	}

	public int minValue() {
		if (root == null) {
			return -1;
		} else if (root.left == null) {
			return root.data;
		} else {
			return minValue(root.left);
		}
	}

	private int minValue(Node node) {
		if (node.left == null) {
			return node.data;
		} else {
			return minValue(node);
		}
	}

	public int size(){
		if(root == null){
			return 0;
		}else{
			return size(root);
		}
	}
	
	private int size(Node node){
		if(node == null){
			return 0;
		}else{
			return size(node.right) + size(node.left) + 1;
		}
	}
	
	public int maxDepth(){
		if(root == null){
			return 0;
		}else{
			return maxDepth(root);
		}
	}
	
	private int maxDepth(Node node) {
		if(node == null){
			return 0;
		}else{
			int left = maxDepth(node.left);
			int right = maxDepth(node.right);
			return Math.max(left,right);
		}
	}

	public void postOrder() {
		if(root == null){
			return;
		}else{
			postOrder(root);
		}
	}
	
	private void postOrder(Node node) {
		if(node == null){
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + "\t");
	}

	public static void main(String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		int[] array = {50,40,44,48,30,20,60,70,80,55};
		for (int i : array) {
			bst.insert(i);
		}

//		System.out.println(bst.maxDepth());
		bst.postOrder();
		
		
	}
}
