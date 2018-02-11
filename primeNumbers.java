package com.zadatak1;

public class primeNumbers {
	
	public static void primeNum(){
		
		int brojac=1;
		
		for (int i=2; i<=1000; i++){
			int prosti=0;
			
			for (int j=1; j<=i; j++){
				
				if (i%j==0){
					prosti++;
				}
			}
			if (prosti==2){
				
				if (brojac%8==0){
					
					System.out.println(i);
					
			}else {
				
				System.out.print(i+" ");
			}
				brojac++;
				}
				
			}
		}

		
	}
