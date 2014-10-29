package interviewprep.leetcode.examples;

public class BitManipulations {
	
	public static int getBitCount(int i){
		int bitCount =0;
		while(i != 0){
			bitCount += i & 1;
			i = i >> 1;
		}
		return(bitCount);
	}
	
	/**
	 * Write a Java method that will return the number of bits that will need to be changed in order to convert an integer, X, into another integer, Y and vice versa. The method should accept two different integers as input. For example, if your method is passed the integers 12 and 16 then your method should return a 3 .
	 * @param x
	 * @param y
	 * @return
	 */
	public static int getNumberOfBitsForIntConversion(int x, int y){
		int z = x ^ y;
		return getBitCount(z);
	}
	
	public static int getEvenRepeatedArrayInts(int[] array){
		int dataBank =0;
		for(int n: array){
			int tmp = 1 << n;
			dataBank = dataBank ^ tmp;
		}
		dataBank = ~dataBank;
		for(int n : array){
			if((dataBank & (1 << n)) >0){
				System.out.println(n);
			}
		}
		return 0;
	}
	
	public static int swapIandJbits(int number, int i, int j){
		number = number ^ (1 << i);
		number = number ^ (1 << j);
		return number;
	}
	
	public static void main(String[] args) {
		int i= 1;
		
		int[] array = {1,6,4,1,4,5,8,8,4,6,8,8,9,7,9,5,9};
		getEvenRepeatedArrayInts(array);
		
		System.out.println(swapIandJbits(8, 0, 2));
	}

}
