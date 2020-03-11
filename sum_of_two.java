package test;

import java.util.HashMap;

public class sum_of_two {

	public static void main(String[] args) {
		int [] arr1 =  {1, -4, 9, -8};
		int [] arr2 = {6, 8, -2, 8};
		int target = -10;
		
		System.out.println(isTrue(arr1, arr2, target));
	}

	private static boolean isTrue(int[] arr1, int[] arr2, int target) {
		
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
		
		for (int i =0; i < arr1.length; i ++) {
			hm1.put(target - arr1[i], arr1[i]);
		}
		
		for (int i =0; i < arr2.length; i ++) {
			if(hm1.containsKey(arr2[i])) 
				{
				System.out.println(arr2[i] +" and "+ hm1.get(arr2[i]));
				return true;
				}
		}
		return false;
	}

}
