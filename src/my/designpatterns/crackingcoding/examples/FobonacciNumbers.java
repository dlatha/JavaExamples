package my.designpatterns.crackingcoding.examples;

import java.awt.color.CMMException;
import java.util.HashMap;
import java.util.Map;


public class FobonacciNumbers {

	public static int getFibSumWRecursion(int n){
		if(n < 0 || n == 1 || n==2){
			return 1;
		}else{
			return fibonacci(n);
		}
		
	}
	
	public static int getFibWDynamicProg(int n){
		if(n <3){
			return 1;
		}else{
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			map.put(1, 1);
			map.put(2, 1);
			return fibonacciDP(n,map);
		}
	}
	
	private static int fibonacciDP(int n, Map<Integer, Integer> map) {
		if(map.containsKey(n)){
			return map.get(n);
		}
		map.put(n-1, fibonacciDP(n-1,map));
		map.put(n-2, fibonacciDP(n-2,map));
		return map.get(n-1) + map.get(n-2);
	}

	private static int fibonacci(int n) {
		if(n < 0 || n == 1 || n==2){
			return 1;
		}
		int sum = fibonacci(n-2) +fibonacci(n-1); 
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getFibWDynamicProg(55));	

	}

}
