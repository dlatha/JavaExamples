package my.designpatterns.crackingcoding.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Given a mapping of alphabets to integers as follows:
 * 
 * 1 = A 2 = B 3 = C ... 26 = Z
 * 
 * Given any combination of the mapping numbers as string, return the number of
 * ways in which the input string can be split into sub-strings and represented
 * as character strings. For e.g. given "111" -> "AAA", "AK", "KA" -> 3 Valid
 * combinations are ({1,1,1}, {1,11},{11,1}) = 3 "11" -> "AA", "K" -> 2 Valid
 * combinations are ({1,1},{11}) = 2 "123" -> "ABC", "LC", "AW" -> 3 Valid
 * combinations are ({1,2,3},{1,23},{12,3}) = 3
 * 
 * You don't have to return all the mappings, only the number of valid mappings.
 * 
 * @author maddy
 * 
 * 
 */
public class StringManipuations {

	private static int getAllValidMappings(String map) {
		if(map.length() <1){
			return 0;
		}else{
			Set<String> validMappings = new HashSet<String>();
			String current = "";
			getAllValidMappings(validMappings, current, map);
			return validMappings.size();
			
		}
	}

	public static String convert(String n){
		char c = 0;
		try{
			c = (char)(64 + Integer.parseInt(n));
			if(c > 'Z'){
				return null;
			}
		}catch(Exception ex){
			return null;
		}
		return (c + "");
	}
	private static void getAllValidMappings(Set<String> validMappings,String current, String remaining) {
		if(remaining.length() == 0){
			validMappings.add(current);
		}else if(remaining.length() == 1){
			current = current + convert(remaining);
			validMappings.add(current);
		}else{
			String singleMap = convert(remaining.substring(0,1));
			String doubleMap = convert(remaining.substring(0,2));
			if(singleMap != null){
				getAllValidMappings(validMappings, current+ singleMap, remaining.substring(1));
			} 
			if(doubleMap != null){
				getAllValidMappings(validMappings, current+ doubleMap, remaining.substring(2));
			}
		}
	}

	public static String longestTwoUniqueSubStr(String str){
		List<String> chars = new ArrayList<String>();
		String maxSubString = "";
		String current = "";
		int i=0;
		for(char c: str.toCharArray()){
			chars.clear();
			chars.add(c + "");
			current = c + "";
			
			for(int j = i+1; j <str.length(); j++){
				if(chars.contains(str.charAt(j) + "")){
					current = current + str.charAt(j);
					if(current.length() > maxSubString.length()){
						maxSubString = current;
					}
				}
				else if(chars.size() == 1){
					chars.add(str.charAt(j) + "");
					current = current + str.charAt(j);
					if(current.length() > maxSubString.length()){
						maxSubString = current;
					}
				}else{
					if(current.length() > maxSubString.length()){
						maxSubString = current;
					}
					current = "";
					break;
				}
			}
			
			i++;
		}
		return maxSubString;
	}
	public static void main(String[] args) {
//		String map = "123";
//		System.out.println(getAllValidMappings(map));
		String str = "lna;samsdaaaaaaaabbbbbbqwasdamasdllllllllllppppppppppppppasdadadqwdads";
		System.out.println(longestTwoUniqueSubStr(str));
		
	}

}
