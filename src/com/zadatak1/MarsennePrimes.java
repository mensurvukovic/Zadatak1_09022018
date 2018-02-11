package com.zadatak1;

public class MarsennePrimes {
	
	public void marsenne(){
		
	printMersennePrimes();	
		
		
	}
	//Provjera da li je broj Prime
    public static boolean isPrime(long n) {

        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;
        }

        return true;
    }
    //Printa Mersenne Prime brojeve
    public static void printMersennePrimes() {
      
        for (int i = 2; i <= 31; i++) {
            int val = (int) Math.pow(2, i) - 1;
            if (isPrime(val)) {
                System.out.print(val + " ");
                
            }
        }
    }

}
