package my.graph.componenets.utils;

/**
 * @author maddy
 * 
 * A Singleton method to 
 * 
 * add Node
 * remove Node
 * 
 * 
 *
 */
public class Graph {
	
	private static Graph INSTANCE = new Graph();
	
	private Graph(){}
	
	public static Graph getInstance(){
		return INSTANCE;
	}
	
	
}
