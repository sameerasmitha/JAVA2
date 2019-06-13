 import java.util.Scanner;
public class CurvedSurfaceOfCube {
   
	   public static void main(String args[]) 
	    {   
	       
		 Scanner s= new Scanner(System.in);
	         
		 System.out.println("Enter the side of cube:");
	         
		 double side=s.nextDouble();
		
		 double  a=CurvedSurfaceOfCube.area(side); 
	 
	         System.out.println("CurvedSurfaceArea Of Cube is:" +a );
	    }
	     public static double area(double side) 
	     {   
	       
		 double  a=4*side*side;
	      
	 
	         return a;
	      }

	 


}
