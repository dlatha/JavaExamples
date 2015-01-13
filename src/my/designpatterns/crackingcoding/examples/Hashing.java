package my.designpatterns.crackingcoding.examples;

import java.util.HashMap;

import my.algorithms.bst.examples.Node;

public class Hashing {
	
	public static HashMap<Node, Integer> loadMap(){
		HashMap<Node,Integer> map = new HashMap<Node, Integer>();
		for(int i=0;i<10;i++){
			Node tmp = new Node(i);
			map.put(tmp, i);
		}
		map.put(new Node(1), 1);
		return map;
	}
	
	public static void main(String[] args) {
		HashMap<Node,Integer> result = loadMap();
		for(Node node:result.keySet()){
			System.out.println(node.getData());
		}

	}

}
