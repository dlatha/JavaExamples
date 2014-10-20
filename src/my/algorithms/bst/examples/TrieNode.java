package my.algorithms.bst.examples;

import java.util.Collection;
import java.util.LinkedList;

public class TrieNode {
	char data;
	boolean marker;
	Collection<TrieNode> children;
	
	public TrieNode(char c){
		children=new LinkedList<TrieNode>();
		data=c;
		marker=false;
	}
	
	public TrieNode getNode(char c){
		if(children!=null){
			for(TrieNode n:children){
				if(n.data==c)
					return n;
			}
		}
		return null;
	}

}