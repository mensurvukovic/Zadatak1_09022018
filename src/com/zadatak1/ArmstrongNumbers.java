package com.zadatak1;

public class ArmstrongNumbers {
	
	public static void armstrong(){
		
		int zbir = 0;
		
		for (int i=1; i<1000; i++){
			
			int broj = i;
			
			while (broj>0){
			
			int ostatak=broj%10;
			broj/=10;
			zbir+=Math.pow(ostatak, 3);
			
		}
			if(zbir == i){
			System.out.println(i);
			
			}
			zbir=0;
		}
		
	}

}
