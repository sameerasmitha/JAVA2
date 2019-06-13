 import java.util.Scanner;
public class Factoral1 {
	
		public static void main(String arg[])	
		{
		   long n;
	             	
	           Scanner sc=new Scanner(System.in);
	 
		   System.out.println("enter number");
		   
	           n=sc.nextLong();
	 
		   long f=Factoral1.fact(n);
	 
		   System.out.println("factorial="+f);
		}
	 
		static long fact(long n)
		 {
		     if(n<=0)
		      return 1;
		      
	              return Factoral1.fact(n-1)*n; 
		}
	  	        	 
	}

	 


