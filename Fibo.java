package cetvrtipaket;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b = 1 , c = 1 , d = 1, m;
		System.out.println("Unesite koji Fibonacijev broj zelite: ");
		a = sc.nextInt();
		m = a - 2;
		if ( a == 1 || a == 2 ) System.out.println(a + ". Fibonacijev broj je 1" );
		else {
			for ( ; m > 0 ; m-- ) {
				d = b + c ;
				b = c;
				c = d;
			}
			System.out.println( a + ". Fibonacijev broj je " + d );
	    }
	}

}
