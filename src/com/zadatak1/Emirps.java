package com.zadatak1;

public class Emirps {
	
	// Printa prvih 100 Emirps brojeva
	public static void emirps(){
	int counter = 0;	
	for (int i = 2; i <= 1000000000; i++) {
		if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
			System.out.print(i + " ");
			counter++;
			
			if (counter == 100) {
				break;
			}
			
			if (counter % 10 == 0) {
				System.out.println();
			}
			}
		}
	}
		
	//Provjera da li je broj Prime
    public static boolean isPrime(long n) {

        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;
        }

        return true;
    }
    //Okrece broj naopako
    public static long reverse(long number) {

        long reverse = 0;
        while (number != 0) {

            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }
    //Provjerava da li je palindom
    public static boolean isPalindrome(long number) {

        return (number == reverse(number));
    }
	

	
}


