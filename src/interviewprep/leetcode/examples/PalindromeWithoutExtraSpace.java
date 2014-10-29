package interviewprep.leetcode.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author ldoddik
 *
 */
public class PalindromeWithoutExtraSpace {

	public static List<String> current = new ArrayList<String>();
	public static boolean isPalindrome(String string){
		int length = string.length();
		
		for(int i=0,j=length-1; i<length/2 ; i++,j--){
			if(j>length/2){
				if(!(string.charAt(i) == string.charAt(j)))
					return false;
			}
		}
		return true;
	}
	
	public static List<String> palindromeSubString(String string){
//		for(int i =0 ; i<string.length(); i++){
//			String remaining = string.substring(i,string.length());
			palindromeSubString(current, string, string, 0);	
		//}
		
		return current;
	}
	private static void palindromeSubString(List<String> curr, String remaining, String string, int iteration) {
		if(remaining == null){
			return;
		}if(remaining.length() == 1){
			return;
		}
		String reverse = new StringBuilder(remaining).reverse().toString();
		if(remaining.equals(reverse)){
				iteration++;
				curr.add(remaining);
				remaining = string.substring(iteration,string.length());
				palindromeSubString(curr,remaining,string,iteration);
				return;
		}
		remaining = remaining.substring(0,remaining.length()-1);
		palindromeSubString(curr,remaining,string,iteration);
		
	}

	public static void main(String[] args) {
		
		String str = "abbabccba";
		
		//System.out.println(isPalindrome(str));
		System.out.println(palindromeSubString(str));
	}

}
