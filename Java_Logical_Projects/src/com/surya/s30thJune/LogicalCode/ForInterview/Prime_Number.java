package com.surya.s30thJune.LogicalCode.ForInterview;

public class Prime_Number {

	public static void main(String[] args) {
		/**
		 * 
		 * ex 11 , 7 , 13 etc
		 * 
		 * divisiable by itself and 1
		 */
		
		
		int n=11; int count=0;
		
		for(int i=1; i<=n/2 ; i++) {
			
			if(n % i ==0) {
				count= count+1;
			}
		}
			if(count >1) {
				System.out.println("Not a Prime Number ");
			}
			else {
				System.out.println("Prime Number ");
			}
		}

	}


