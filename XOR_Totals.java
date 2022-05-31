package Softnerve;

import java.util.Scanner;

public class XOR_Totals {
	public static void main(String[] args)   { 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter size of array : ");
		
		int size=sc.nextInt();
		
		int[] arr = 
				new int[size];
		
		System.out.println("enter array number : ");
		
		for(int i=0; i<size; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		 int res = 0, n = arr.length;
	        for(int i = 0; i < (1 << n); i++) {
	        	
	            int xo = 0;
	            
	            for(int j = 0; j < n; j++) {
	            	
	                if((i & (1 << j)) > 0) {
	                	
	                    xo ^= arr[j];
	                }
	            }
	            res += xo;
	        }
	        System.out.println("XOR is : "+ res);;
		
		}    

}
