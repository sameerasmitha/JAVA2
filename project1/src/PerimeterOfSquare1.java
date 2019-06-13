 import java.util.Scanner;
public class PerimeterOfSquare1 {
	
	      
	   public static void main(String args[]) 
	    {   
	            
		 Scanner s= new Scanner(System.in);
	        
	         System.out.println("Enter the side of the Rhombus:");
	         
	         double a= s.nextDouble();
		 
		 double  perimeter=PerimeterOfSquare1.area(a); 
	 
	         System.out.println("perimeter of Square is: " + perimeter);          
	      }
	     public static double area(double l)
	    {   
	       
		 double  a=4*l;
	 
	         return a;
	      }
	 
	}

	 



