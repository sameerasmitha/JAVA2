import java.util.Scanner;
public class PerimeterOfequilateralTriangle1 {

      
   public static void main(String args[]) 
    {   
           Scanner s= new Scanner(System.in);
        
           System.out.println("Enter the side of the Triangle:");
         
	   double a= s.nextDouble();
         
	   double  perimeter=PerimeterOfequilateralTriangle1.area(a);  
			 
 
           System.out.println("perimeter of Triangle is: " + perimeter);    
      }
     public static double area(double s1)
    {   
       
	   double  a=3*s1;
 
           return a;
    }
 
 
 


 


}
