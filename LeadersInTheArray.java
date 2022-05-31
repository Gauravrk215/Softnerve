package Softnerve;

import java.util.Scanner;

public class LeadersInTheArray {
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
	 int i,j;
	int len=arr.length;
	    
	        for(i=0; i<len; i++)
	        {           
	            for(j=i+1; j<len; j++)
	            {
	                if(arr[i] <=arr[j])
	                    break;
	            }
	            if(j==len) 
	                System.out.print("Leder of the array is : "+arr[i] + " ");
	        }
	    }	 
	    
	}
	

