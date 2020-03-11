package test;
import java.util.HashSet;

public class firstDuplicate {
	public static void main(String[] args) {
		int [] arr = {1,2,2,3,3};		
		System.out.println(firstDup(arr));
	}
	private static int firstDup(int[] arr) {	
		HashSet<Integer> hs =  new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i])) {
				return arr[i];
			}
			else hs.add(arr[i]);
		}		
		return -1;
	}

}
