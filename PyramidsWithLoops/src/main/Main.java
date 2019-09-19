/* 
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 8;
		for (int i = 0; i <= lines; i++) {
			for ( int j = lines; j > i ; j--) {
				System.out.print(" ");
			}
		for (int p = 1; p <= i; p++) {
			System.out.print(i);
		}
		if (i > 1) {
			for (int k = 1; k < i; k++) {
				System.out.print(i);
			}
		}
		System.out.println("");
		}
	}
}
