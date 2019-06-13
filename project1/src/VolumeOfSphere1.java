import java.util.Scanner;
public class VolumeOfSphere1 {

      
   public static void main(String args[]) 
    {   
	
            	Scanner s= new Scanner(System.in);
         	System.out.println("Enter the radius of sphere:");
         	double r=s.nextDouble();
                
	
                 double  volume= VolumeOfSphere1.area(r); 
 
             System.out.println("Volume Of Sphere is:" +volume);
      }
 
     public static double area(double r) 
    {   
       
                 double  volume= (4*22*r*r*r)/(3*7);
 
                  return volume;
      }

 


}
