package my.algorithms.bst.examples;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeImpl implements BinarySearchTree{

	Node root = null;
	List<Node> preOrder = new ArrayList<Node>();
	List<Node> inOrder = new ArrayList<Node>();
	
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
			return maxDepth(root,0);
		}
	}
	
	private int maxDepth(Node node,int depth) {
		if(node == null){
			return 0;
		}else{
			depth = depth + 1;
			int left = maxDepth(node.left,depth);
			int right = maxDepth(node.right,depth);
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
	
	public void preOrder(){
		if(root == null){
			return;
		}else{
			preOrder(root);
		}
		
	}
	private void preOrder(Node node) {
		if(node == null){
			return;
		}
		System.out.print(node.data + "\t");
		preOrder.add(node);
		preOrder(node.left);
		preOrder(node.right);
		System.out.println();
	}
	
	public void inOrder(){
		if(root == null){
			return;
		}else inOrder(root);
	}

	private void inOrder(Node node) {
		if(node == null){
			return;
		}inOrder.add(node);
		inOrder(node.left);
		System.out.print(node.data + "\t");
		inOrder(node.right);
	}

	public boolean hasPathSum(int value) {
		if(root == null){
			return false;
		}else{
			return hasPathSum(root, value);
		}
	}

	private boolean hasPathSum(Node node, int value) {
		if(node == null){
			return value == 0;
		}else{
			int subSum = value - node.data;
			return (hasPathSum(node.left,subSum) || hasPathSum(node.right, subSum)); 
		}
	}

	public void mirrorBinaryTree(	) {
		if(root == null) return;
		
		System.out.println(root.data);
		preOrder.add(root);
		preOrder(root.left);
		preOrder(root.right);
		root = preOrder.get(0);
		for(int i=1; i< preOrder.size(); i++){
			mirrorBinaryInsert(preOrder.get(i).data);
		}
	}

	private void mirrorBinaryInsert(int value) {
		if(root == null){
			return;
		}else{
			mirrorBinaryInsert(root, value);
		}
	}

	private void mirrorBinaryInsert(Node node, int value) {
		if(node == null){
			return;
		}else if(value < node.data){
			if(node.right != null){
				mirrorBinaryInsert(node.right,value);
			}else{
				node.right = new Node(value);
				System.out.println("inserted right:" + value);
			}
		}else{
			if(node.left != null){
				mirrorBinaryInsert(node.left,value);
			}else{
				node.left = new Node(value);
				System.out.println("inserted left:" + value);
			}
		}
	}

	public void doubleBinaryTree() {
		if(root == null){
			return;
		}else{
			doubleBinaryTree(root);
		}
	}

	private void doubleBinaryTree(Node node) {
		if(node == null){
			return;
		}else{
			if(node.left == null){
				node.left = new Node(node.data);
				System.out.println("new left node" +  node.left.data);
			}else{
				Node left = node.left;
				node.left = new Node(node.data);
				node.left.left = left;
				System.out.println("new left node" +  node.left.data);
				if(node.right != null){
					doubleBinaryTree(node.left.left);
					doubleBinaryTree(node.right);	
				}else{
					// alright setting up this thing.. 
					doubleBinaryTree(node.left.left);
				}
			}
		}
	}
	
	public boolean sameTree(BinarySearchTreeImpl tree){
		if(tree.root == null){
			return false;
		}else{
			System.out.println("preOrder tree1");
			preOrder(root);
			List<Node> tree1_preOrder = new ArrayList<Node>();
			tree1_preOrder.addAll(preOrder);
			preOrder.clear();
			System.out.println("preOrder tree2");
			preOrder(tree.root);
			List<Node> tree2_preOrder = preOrder;
			System.out.println("inOrder tree1");
			inOrder(root);
			List<Node> tree1_inOrder = new ArrayList<Node>();
			tree1_inOrder.addAll(inOrder);
			inOrder.clear();
			System.out.println();
			System.out.println("inOrder tree2");
			inOrder(tree.root);
			List<Node> tree2_inOrder = inOrder;
			if(tree1_preOrder.size() != tree2_preOrder.size()){
				return false;
			}for(int i =0; i < tree1_preOrder.size() ; i++){
				if(!(tree1_preOrder.get(i).data == tree2_preOrder.get(i).data) || !(tree1_inOrder.get(i).data == tree2_inOrder.get(i).data)){
					return false;
				}
			}
			return true;
		}
		
	}

	public void getRootToLeafPaths() {
		System.out.println("Root to Leaf Paths");
		if(root == null){
			return;
		}
		getRootToLeafPaths(root, new ArrayList<Node>());
	}

	private void getRootToLeafPaths(Node node, ArrayList<Node> path) {
		if(node == null){
			return;
			
		}path.add(node);
		if(node.left == null && node.right == null){
			for(Node n : path){
				System.out.print(n.data + "\t");
			}
			System.out.println();
			return;
		}
		getRootToLeafPaths(node.left, new ArrayList<Node>(path));
		getRootToLeafPaths(node.right, new ArrayList<Node>(path));
	}

	public void getAllDepthsFromRootToLeaf() {
		if(root == null){
			return;	
		}
		int depth =0;
		getAllDepthsFromRootToLeaf(root, new ArrayList<Node>(), depth);
	}

	private void getAllDepthsFromRootToLeaf(Node node, ArrayList<Node> paths, int depth) {
		if(node == null){
			return;
		}paths.add(node);
		depth = depth + 1;
		if(node.left == null && node.right == null){
			for(Node n: paths){
				System.out.print(n.data + "\t");
			}
			System.out.print("depth:" + depth + "\n");
			return;
		}
		getAllDepthsFromRootToLeaf(node.left,new ArrayList<Node>(paths), depth);
		getAllDepthsFromRootToLeaf(node.right,new ArrayList<Node>(paths), depth);
	}

	public int getTreeHeight() {
		if(root == null){
			return 0;
		}
		return Math.max(getTreeHeight(root.left, 1),getTreeHeight(root.right,1));
		
	}

	private int getTreeHeight(Node node,int sum) {
		if(node == null){
			return 0;
		}
		sum = sum +1;		
		getTreeHeight(node.left,sum);
		getTreeHeight(node.right,sum);
		return sum;
	}

	public int maxDepth1() {
		if(root == null){
			return 0;
		}
		List<Node> list = new ArrayList<Node>();
		// maxDepth1(root, list);
		 return 0;
	}

	private void maxDepth1(Node node, ArrayList<Node> paths) {
		if(node == null){
			return;
		}if(node.left == null && node.right == null){
			System.out.print(paths);
		}
		paths.add(node);	
		
	}

}
