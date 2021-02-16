/*
 Christian Varela
 CS 111B
 2/16/21
 Dave Harden
 File name: A4_3.Java
 
 Description of program: 



*/

import java.util.Scanner;

public class A4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number greater than 0 (less than 1 to quit): ");

		int num = scan.nextInt();
		int sum = 0;
		int square;

		while (num >= 1) {

			for (int n = 1; n < num + 1; n++) {
				square = n * n;
				sum = square;
			}
			System.out.printf("The sum of the squares from 1 to %d", num);

			System.out.printf(" is %d", sum);

			num = scan.nextInt();
		}

	}

}

/*
 * while(num>=1) {
 * System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
 * num = scan.nextInt();
 */
