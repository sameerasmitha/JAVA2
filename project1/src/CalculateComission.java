 import java.util.Scanner;
public class CalculateComission {

	public static void main(String arg[])	
	{
 
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amount:");
 
	  double amount=sc.nextDouble();
 
	  System.out.print("Enter commissionPercentage:");
 
          double comissionPercentage=sc.nextDouble();
 
	  double comission=(comissionPercentage/100)*amount;  	   
 
      	  System.out.println("Comission amount="+comission);
 
}

 

}
