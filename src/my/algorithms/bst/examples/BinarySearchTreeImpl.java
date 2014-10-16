package my.algorithms.bst.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeImpl implements BinarySearchTree{

	Node root = null;
	List<Node> preOrder = new ArrayList<Node>();
	
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
	}
	
	public void inOrder(){
		if(root == null){
			return;
		}else inOrder(root);
	}

	private void inOrder(Node node) {
		if(node == null){
			return;
		}
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

	public void mirrorBinaryTree(Node node) {
		if(root == null) return;
		
		System.out.println(root.data);
		preOrder.add(root);
		preOrder(root.left);
		preOrder(root.right);
		root = preOrder.get(0);
		while(!stack.empty()){
			mirrorBinaryInsert(stack.pop().data);
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
	
	
}
