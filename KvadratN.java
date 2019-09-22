package cetvrtipaket;

import java.util.Scanner;

public class KvadratN {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, m;
	String s = "" ;
	System.out.print("Unesite stranicu kvadrata: ");
	a = sc.nextInt();
	m = a;
	for ( ; a > 0 ; a-- ) {
		s += "*" ;
	}
	for ( ; m > 0 ; m--) {
		System.out.println(s);	
	}
	}
}
