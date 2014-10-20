package my.algorithms.bst.examples;

public class TrieImpl {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("cat");
		t.insert("cot");
		t.insert("cut");
		t.insert("cit");
		
		
		t.search2("cat",t.root);
	}

}
