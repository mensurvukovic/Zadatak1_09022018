package com.zadatak1;

public class Fibonacci {

	public static void fibonacci() {

		long[] fibonaciNiz = new long[100];

		for (int i = 0; i <= fibonaciNiz.length - 1; i++) {

			if (i < 2) {
				int clan = i;
				fibonaciNiz[i] = clan;
			} else {
				long clan = fibonaciNiz[i - 1] + fibonaciNiz[i - 2];
				fibonaciNiz[i] = clan;
			}

		}
		for (int i = 0; i <= fibonaciNiz.length - 1; i++) {
			System.out.println(fibonaciNiz[i]);
		}
	}
}
