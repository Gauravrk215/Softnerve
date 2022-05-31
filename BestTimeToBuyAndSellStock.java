package Softnerve;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
		
		System.out.print("enter size of array : ");
		
		int size=sc.nextInt();
		
		int[] arr = 
				new int[size];
		
		System.out.println("enter array number : ");
		
		for(int i=0; i<size; i++) {
			
			arr[i]=sc.nextInt();
		}
	int i,	buy=Integer.MAX_VALUE, Max_profit=0;
	
	for(i=0; i<arr.length; i++) {
		
		buy=Math.min(buy, arr[i]);
		
		Max_profit=Math.max(Max_profit,arr[i]- buy);
	}
	
	System.out.println(Max_profit);	
			
	}
	
		}



