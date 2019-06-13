import java.util.Scanner;
public class TotalSurfaceAreaOfCylinder1 {

      
   public static void main(String args[]) 
    {   
       	
            	Scanner s= new Scanner(System.in);
         	
		System.out.println("Enter the length of Cubiod:");
         	
		double r=s.nextDouble();
		
		System.out.println("Enter the breadth of Cubiod:");
         	
		double h=s.nextDouble();
		 
		double  tsa=TotalSurfaceAreaOfCylinder1.area(r,h); 
 
               System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
      }
     public static double area(double r,double h) 
    {   
       
                double  a= ((2*22*r)/7)*(r+h);
 
       		return a;
      }

 
}
