import java.util.Scanner;
public class A5_2practice_2 {

	public static void main(String[] args) {
		
		boolean isPrime;
		boolean isPerfect;
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int n=scan.nextInt();
	       
	if ( isPerfect= true){
			System.out.println(n  +" is a perfect number");
	        }
		
	     
	    if (isPrime = true){ 
	            System.out.println(n +" is a prime number");
        }
	}
		
		public static boolean isPrime(int n, boolean isPrime) {
			
			if (n %2!=0) {   
			return true;
		}
			return isPrime;
		}


	public static boolean isPerfect(int n, boolean isPerfect)
		  {
		    int sum = 0;
		    for(int i=1; i<=n; i++)
		    {
		      if(n%i == 0)
		      {
		        sum += i;
		      }
		    }
		    if(sum/2 == n)
		    {
		      return true;
		    }
		    return false;
		
		
		
		
		  }

		  }

