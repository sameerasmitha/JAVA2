
import java.util.*;
public class Fibonacci {
	public  static void main(String args[])
	{
		int a=0,b=0,c=1,n;
		Scanner S=new Scanner(System.in);
		System.out.println("enter value of n");
		n=S.nextInt();
		System.out.println("fibonnaciseies");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
				
	}

}
