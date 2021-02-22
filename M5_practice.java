import java.util.Scanner;



public class M5_practice {
	
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		 int width;
	     int height;
	    
	     int numStages;
	        
		drawCone();
        drawBox();
        drawBox();
        drawCone();
        
       
      width = getWidth();
      height = getHeight();
      numStages = getNumStages();
     
        drawRocket(height, width, numStages);
	   
    		
}

	
	public static int getNumStages() {
		System.out.print("Enter the number of stages: ");
		return scan.nextInt();
		
	}
	
	public static int getHeight() {
		System.out.print("Enter the height of stage: ");
		return scan.nextInt();
	}
	
	public static int getWidth() {
		System.out.print("Enter the width of stage: ");
		return scan.nextInt();
	}
	

	
	private static void drawCone() {
		    
		System.out.println("  *  ");
        System.out.println(" * * ");
        System.out.println("*   *");
	        }
	 public static void drawBox() {               
		 drawHorizontalLine();
	     draw2VerticalLines();
	     drawHorizontalLine();
	      
         }
         
	private static void drawHorizontalLine() {
		for (int count = 0; count < 5; count++){    
			System.out.print("*");
	       
        }
        System.out.println();
	}
        public static void draw2VerticalLines() {               
            for (int count = 0; count < 4; count++){
                System.out.print("*   *\n");
            }
        }
            // hello
        public static void drawHorizontalLine(int numXs) {               
            for (int count = 0; count < numXs; count++){
                System.out.print("*");
            }
            System.out.println();
        }

        public static void draw2VerticalLines(int numSpaces, int numRows) {                          
            for (int rowCount = 0; rowCount < numRows; rowCount++){
                drawOneRow(numSpaces);
            }
        }


        public static void drawOneRow(int numSpaces) {
            System.out.print("*");
            for (int spaceCount = 2; spaceCount < numSpaces; spaceCount++){    
                System.out.print(" ");
            }
            System.out.println("*"); 
            
            
            
        }
            private static void drawRocket(int height, int width, int numOfStages) {
               drawCone();
               
               for (int i = 0; i < numOfStages; i++) {
            	   drawHorizontalLine(width);
          	     draw2VerticalLines(width, height);
          	     drawHorizontalLine(width);
               }
       drawCone();
       
       
       
            }
            
            // hello 3
            
    }
        
	