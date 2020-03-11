package test;

import java.util.ArrayList;

//structure of the solution:
class Interval{
	int buy, sell;
}
public class StockBuySell {
	public void stockbuysell(int price[], int n) {
		if (n==1)
			return;
		int count =0;
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i =0;
		while (i < n - 1) { 
		while ((i<n-1) && price[i+1]<price[i]) {
			i++;
			if(i==n-1) 
				break;
		}
		
		Interval e = new Interval();
		e.buy=i++;
		
		while ((i<n) && price[i]>price[i-1]) 
			i++;
		
		e.sell = i-1;
		sol.add(e);
		
		count++;
		}	
		
		if(count==0) System.out.println("no point");
		else 
			for (int j  =0; j<count; j++) 
				System.out.println((sol.get(j).buy +", "+ sol.get(j).sell));
		return;
			
	}

	public static void main(String[] args) {
		StockBuySell stock = new StockBuySell(); 
		  
        // stock prices on consecutive days 
        int price[] = { 100, 180, 260, 310, 40, 535, 695 }; 
        int n = price.length; 
        System.out.println(n);
        // fucntion call                      
        stock.stockbuysell(price, n); 
    
	}

}
