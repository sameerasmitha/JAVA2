import java.util.Scanner;
public class PerimeterOfRectangle1 {
	
	      
	   public static void main(String args[]) 
	    {   
	             Scanner s= new Scanner(System.in);
	        
	             System.out.println("Enter the length of the Rectangle:");
	         
		     double l= s.nextDouble();
		 
		     System.out.println("Enter the width of the Rectangle:");
	         
	 	     double b= s.nextDouble();
	 
		     double  perimeter=PerimeterOfRectangle1.area(l,b); 
	 
	      	     System.out.println("perimeter of Rectangle is: " + perimeter);          
	      }
	     public static double area(double l,double b)
	    {   
	             double  a=2*(l+b);
	 
	             return a;
	      }
	 
	 

	 


}
