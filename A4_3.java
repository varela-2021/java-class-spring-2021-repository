import java.util.Scanner;

int+push;

public class A4_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number greater than 0 (less than 1 to quit): ");
		
		int num = scan.nextInt();
		int sum = 0;
		int square;
		
		if(num > 1 || num == 1) {
			for (int n =1 ; n < num+1 ; n++ ) {
				square = n * n;
				sum += square;
			}
			System.out.printf("The sum of the squares from 1 to %d",num);
			System.out.printf(" is %d",sum);
		
		}
		
		
			
	}

}


/* Enter a number greater than 0 (less than 1 to quit): 4
The sum of the squares from 1 to 4 is 30 */
