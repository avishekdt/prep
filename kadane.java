package test;

public class kadane {

	public static void main(String[] args) {
		int [] arr = {-2,2,5,-11,6};
		System.out.println(maxSum(arr));
		
		int [] arr2 = {1,7,-9,-2,5,9};
		System.out.println(maxSum(arr2));	
		}

	private static int maxSum(int [] arr) {
		int curr = arr[0];
		int max = curr;
		
		for(int i =1;i<arr.length;i++) {
			curr = Math.max(curr+arr[i], arr[i]);
			max = Math.max(curr, max);
		}		
		return max;
	}	
}
