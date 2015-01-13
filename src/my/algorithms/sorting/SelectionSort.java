package my.algorithms.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		 int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		 selectSort(input);
		 System.out.println(input);
	}

	private static void selectSort(int[] input) {
		int min;
		for(int i=0; i<input.length-1; i++){
			min = input[i];
			for(int j=i+1;j <input.length;j++){
				if(input[j]<min){
					min =input[j];
				}
			}
			if(min != i) {
		        swap(input[i], input[min]);
		    }
		}
		
	}

	private static void swap(int i, int j) {
		int tmp = i;
		i=j;
		j=tmp;
	}

}
