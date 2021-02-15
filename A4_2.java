import java.util.Scanner;

public class A4_2 {
	
public static final int CONSTANT_NUMBER_SEVEN = 7;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		 
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will be entered? ");

		int numCount = scan.nextInt();
		int firstPos = 0;
		int lastPos = 0;
		boolean seven = true;
		
		
		
		
			for (int n =0 ; n < numCount ; n++ ) {
		       System.out.print("Eneter the num: ");
		       int num = scan.nextInt();
		       if(num==CONSTANT_NUMBER_SEVEN) {
		    	   if(firstPos == 0) {
		    		   firstPos = n+1;
		    		   
		    	   }
		    	    
		    		   lastPos = n;
		    		   seven = false;
		    	   }
}
		           
		       
		    	 if (seven) {
		             System.out.println("Sorry no 7's were entered.");
		       } else {
			
		       System.out.println("The first 7 was in position " + firstPos);
		       System.out.println("The last 7 was in position " + lastPos);
		       }
		       
		       
		    	 scan.close();
		    	 
			}
		
			

}
