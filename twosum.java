package test;

import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
		int [] arr =  {1,3,4,5,8,9};
		int target = 10;
		
		test(arr, target);

	}

	private static void test(int[] arr, int target) {
		HashMap<Integer, Integer> hm =  new HashMap<Integer, Integer>();	
		for (int i =0; i < arr.length; i ++) {
			if(hm.containsKey(arr[i]))
			{
				System.out.println(arr[i]+ " and " + hm.get(arr[i]));
			}
			else 
				hm.put(target - arr[i], arr[i]);
		}

	}

}
