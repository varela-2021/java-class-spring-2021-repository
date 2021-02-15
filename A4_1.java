import java.util.Scanner;
public class A4_1 {
	
		
		private static final int AGE_0_TO_18 = 0;
		private static final int AGE_19_TO_30= 0;
		private static final int AGE_31_40 = 0;
		private static final int AGE_41_TO_60 = 0;
		private static final int AGE_OVER_60 = 0;
		
		
		
		
		

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			int num5= 0;
			int numPerson = 0;
			double sum = 0;
			double average;
			int youngest = 99999999;
			int oldest = 0;
			int popcorn = 0;
			int soda = 0;
			int both = 0;
			String type;
			
		
			System.out.print("Enter age of attendee (negative number to quit): ");
			 int age = Integer.parseInt(scan.nextLine());  
			// int age = scan.nextInt();
			
			if(age>=0) {
			
				while(age >= 0) {
					System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both):");
					type = scan.next();
					switch (type) 
	                {
	                case "s":
	                    soda++;
	                    break;
	                case "p":
	                    popcorn++;
	                    break;
	                case "b":
	                    both++;
	                    break;
	                }

					
					numPerson++;
					sum = sum+age;
					if(youngest > age) {
						youngest = age;
					}
					if(oldest < age) {
						oldest = age;
					}
					if (age >=0 && age <= 18 ){
						num1++;
						
					}else if (age>= 19 && age<= 30) {
						num2++;
						
					}else if (age>= 31 && age<= 40 ) {
						num3++;
						
					}else if (age>= 41 && age<= 60 ) {
						num4++;
						
						
					}else if (age>= 60) {
						num5++;
						
					}
					System.out.print("Enter age of attendee (negative number to quit): ");
					// String line = scan.nextLine()
					// if(!line.equals("")) 
						//age = Integer.parseInt(scan.nextLine());
					age = scan.nextInt();
					
				}
				average = sum/numPerson;
				System.out.println("\nage 0 to 18: " + num1 + "\nage 19 to 30: " + num2 + 
						"\nage 31 to 40: " + num3 + "\nage41 to 60: " + num4 + "\nover 60: " + num5);
				System.out.println();
				System.out.println("food prefernce popcorn: " + popcorn + "\nfood prefernce soda: " + soda + "\nfood prefernce both: " + both);
				
				
				System.out.printf("\nThe average age was %.1f",average);
				System.out.println("\nThe youngest person in attendance was " + youngest + "\nThe oldest person in attendance was " + oldest);
				
				
				
			   
				
		
				scan.close();
			    
				
			}else {
				System.out.println("Have a nice day!");
			}
			
			
		}
		
			
	}
			

	/* age 0 to 18: 1
	age 19 to 30: 2
	age 31 to 40: 2
	age41 to 60: 1
	over 60: 1

	food prefernce popcorn: 1
	food prefernce soda: 4
	food prefernce both: 2

	The average age was 36.3
	The youngest person in attendance was 16
	The oldest person in attendance was 68 */
