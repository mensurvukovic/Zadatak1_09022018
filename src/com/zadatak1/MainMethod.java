package com.zadatak1;
import java.util.*;

public class MainMethod {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"\n1. Print Armstrong numbers \n2. Print Emirps numbers \n3. Print Fibonacci + "
				+ "\n4. Print Marsenne primes numbers \n5. Print Prime numbers");
		int option = input.nextInt();
		
		switch(option){
		
		case 1:
			
			ArmstrongNumbers.armstrong();
			
			break;
		
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		}
		
		//Emirps.emirps();
		//MarsennePrimes.printMersennePrimes();
	}

}
