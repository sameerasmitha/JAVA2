import java.util.Scanner;
public class VolumeOfPrims1 {
	    
	   public static void main(String args[]) 
	    {   
		
	         Scanner s= new Scanner(System.in);
	        
	         System.out.println("Enter the area of base:");
	         double base=s.nextDouble();
	         System.out.println("Enter the height:");
	         double height=s.nextDouble();
	 
	                 double  a= VolumeOfPrims1.Volume(base,height); 
	 
	             System.out.println("Volume Of Prism is:" +a);
	      }
	     public static double Volume(double b,double h) 
	    {   
	       
	                 double  a=b*h ;
	 
	                 return a;
	      }

	 


}
