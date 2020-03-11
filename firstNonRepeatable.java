package test;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatable {

	public static void main(String[] args) {
		String s = "aaabbcddde";
		String s1 = "11";
		String s2 = "";
		String s3 = "aaabbb";
		String s4 = "ab";
		String s5 = "_*_a";
		
		System.out.println("s" +test(s));
		//System.out.println(test2(s));
		
		
		
		
		System.out.println("s1: " +test(s1));
		System.out.println("s2: " +test(s2));
		System.out.println("s3: " +test(s3));
		System.out.println("s4: " +test(s4));
		System.out.println("s5: " +test(s5));
		//System.out.println("s6" +test(s6));
		//System.out.println("s7" +test(s7));
		
	}
	private static char test(String s) {
		char res = '_';
		Map<Character, Integer> hm = new HashMap<Character, Integer>(); 
		//O(n)
		for (int i =0; i<s.length();i++) {
			char c  =  s.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else hm.put(c,1);				
		}
		
		//O(n)
		for (int i =0; i<s.length();i++) {
			char c = s.charAt(i);
			if(hm.get(c)==1)
				return c;
		}	
		return res;
		
	}
	
	
	private static char test2(String s) {
		char res = '_';
		int [] count = new int[26];
		
		for(char c : s.toCharArray()) 
			count[c -'a']++;
		
		for(char c : s.toCharArray()) 
			if( count[c -'a'] ==1) return c;
		return res;
		
	}
}
