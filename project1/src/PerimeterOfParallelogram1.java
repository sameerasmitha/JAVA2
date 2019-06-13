import java.util.Scanner;
public class PerimeterOfParallelogram1 {
	
	      
	   public static void main(String args[]) 
	    {   
	             Scanner s= new Scanner(System.in);
	        
	             System.out.println("Enter the height of the Parallelogram:");
	             
		     double h= s.nextDouble();
		     
		     System.out.println("Enter the breadth of the Parallelogram:");
	             
		     double b= s.nextDouble();
		     
	 	     double  perimeter=PerimeterOfParallelogram1.area(h,b); 
	             
	             System.out.println("perimeter of Parallelogram is: " + perimeter);     
	      }
	     public static double area(double h,double b)
	    {   
	       
		     double  a=2*(h+b);
	 
	             return a;
	      }
	 
	 
	

	 


}
