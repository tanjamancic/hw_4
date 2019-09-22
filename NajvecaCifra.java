package cetvrtipaket;

import java.util.Scanner;

public class NajvecaCifra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, m, p = 0, o;
		System.out.print("Unesite N broj: ");
		n = sc.nextLong();
		o = n;
		while ( n > 0 ) {
			m = n % 10;
			if ( m > p ) p = m;
			if ( p == 9 ) break;
			n /= 10;
		}
		System.out.println("Najveca cifra broja " + o + " je: " + p);
	}
}
