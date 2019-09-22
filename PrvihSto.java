package cetvrtipaket;

import java.util.Scanner;

public class PrvihSto {

	public static void main(String[] args) {
		int a;
		for ( a = 1 ; a <= 100 ; a++ ) {
			if ( a % 3 == 0 && a % 5 == 0 ) System.out.print( " FizzBuzz " );
			else if ( a % 3 == 0) System.out.print( " Fizz " );
			else if ( a % 5 == 0) System.out.print( " Buzz " );
			else System.out.print(" " + a + " ");
		}
		
		
			
	}

}
