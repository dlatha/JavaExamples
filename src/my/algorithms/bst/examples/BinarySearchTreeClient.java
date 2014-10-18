package my.algorithms.bst.examples;

public class BinarySearchTreeClient {
	
	public static void main(String args[]) {
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl();
		BinarySearchTreeImpl bst2 = new BinarySearchTreeImpl();
		int[] array = {4,6,5,2,3,1,-11};
		int[] arry2 = {4,6,5,2,3,1,-11};
		for (int i : array) {
			bst.insert(i);
		}
		for (int i : arry2) {
			bst2.insert(i);
		}
		System.out.println("la la la");
		System.out.println(bst.sameTree(bst2));
	}
}
