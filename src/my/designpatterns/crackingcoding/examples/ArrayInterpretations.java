package my.designpatterns.crackingcoding.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayInterpretations {

	/**
	 * You're given an array of integers(eg [3,4,7,1,2,9,8]) Find the index of
	 * values that satisfy A+B = C + D, where A,B,C & D are integers values in
	 * the array.
	 * 
	 * Eg: Given [3,4,7,1,2,9,8] array The following 3+7 = 1+ 9 satisfies
	 * A+B=C+D so print (0,2,3,5)
	 * 
	 * @param array
	 */
	public static void printSumIndexes(int[] array){
		if(array.length <4){
			return;
		}else{
			Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
			for(int i=0; i<array.length; i++){
				for(int j=1; j<array.length; j++){
					Integer sum = array[i] + array[j];
					if(!map.containsKey(sum)){
						List<Integer> list = new ArrayList<Integer>();
						list.add(array[i]);
						list.add(array[j]);
 						map.put(sum, list);
					}else{
						System.out.println("The for sum " + sum + " is: " + map.get(sum).get(0).intValue() + "\t" +  map.get(sum).get(1).intValue() + "\t"+ array[i] + "\t" + array[j] + "\t");
						
					}
				}
			}
		}
	}
	
	/**
	 * Get triplets of a sum from the array.
	 * @param array
	 */
	public static void printSumTriplets(int[] array){
		
	}
	
	public static void quickSort(int[] array){
		if(array == null){
			return;
		}
		quickSort(array,0,array.length);
	}
	
	private static void quickSort(int[] array, int start, int end) {
		if(array== null){
			return;
		}
		int pivot = start;
		if(array[start] < array[pivot]){
			
		}else{
			
		}
	}

	private static int partition(int start, int end) {
		int pivot = start;
		return 0;
	}

	public static void main(String[] args) {
		int[] array = {3,4,7,1,2,9,8};
		printSumIndexes(array);

	}

}
