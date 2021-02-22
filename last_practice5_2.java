import java.util.Scanner;

public class last_practice5_2 {

	public static boolean isPrime(int number) {

		// All negative numbers, 0 and 1
		// are not a prime number
		if (number <= 1)
			return false;

		// check for remaining
		for (int i = 2; i < number; i++)
			if (number % i == 0)
				return false;

		return true;
	}

	public static boolean isPerfect(int number) {

		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
			if (temp == number) {

				return true;

			}
		}
		return false;

	}

	public static void main(String[] args) {

		// declare variables
		int number = 0;
		boolean flag = false;

		// create Scanner class object
		Scanner scan = new Scanner(System.in);

		// read number
		System.out.print("Enter a number: ");
		number = scan.nextInt();

		// check number is prime number or not
		flag = isPrime(number);

		// display result
		if (flag) // true
			System.out.println(number + " is a prime number");
		else if (!flag)// false
			System.out.println(number + " is perfect number");

		// close Scanner class object
		scan.close();
	}

}
