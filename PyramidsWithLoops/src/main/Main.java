//Tylar Orlowski
//orlowstt@mail.uc.edu
//Assignment 04 
//Due Date: September 26th
//Description: Building a pyramid 
//Course: Application Dev w/Java

package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
		for (int i = 0; i <= lines; i++) {
			for ( int j = lines; j > i ; j--) {		//This for spaces
				System.out.print(" ");
			}
		for (int p = 1; p <= i; p++) {				//This for half of the pyramid
			System.out.print(i);
		}
		if (i > 1) {
			for (int k = 1; k < i; k++) {			//This is for the last half
				System.out.print(i);
			}
		}
		System.out.println("");						//This is for the next line
		}
	}
}
