package cetvrtipaket;

import java.util.Scanner;

public class SumaPoz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b = 1, sum = 0; 
		while ( b <= 5 ) {
			System.out.print("Unesite " + b++ + ". broj: " );
			a = sc.nextInt();
			if ( a > 0 ) sum += a; 
		}
		System.out.println("Suma unetih pozitivnih brojeva je: " + sum);
	}

}
