package test;

public class factorial {

	public static void main(String[] args) {

		int  result  = fact(5);
		System.out.println(result);
		
		int  fibo  = fibo(7);
		System.out.println(fibo);

	}

	private static int fact(int i) {
		//base case

		if(i==0) 
			return 1;

		else 
			return i * fact (i-1);

	}
	
	private static int fibo(int i) {
		//base case
		if (i<0) {System.out.println("invalid");}
		if (i==1|| i==2) 
			return i-1;
		else return fibo(i-1) + fibo (i-2);

	}

}
