import java.util.Scanner;
public class VolumeOfCyclinder1 {
	
	      
	   public static void main(String args[]) 
	    {   
	       
		Scanner s= new Scanner(System.in);
	        
	         System.out.println("Enter the radius:");
	         double r=s.nextDouble();
	         System.out.println("Enter the height:");
	         double h=s.nextDouble();
	 
	 
	                 double  a=VolumeOfCyclinder1.Volume(r,h); 
	 
	             System.out.println("Volume Of  Cylinder is:" +a);
	      }
	 
	     public static double Volume(double r,double h) 
	    {   
		
	            double  a=((22*r*r*h)/7);
	      
	 
	                  return a;
	      }
	      
	

	 


}
