

public class Primenum {
	public static void main(String args[])
	{
		int count,i,a,p;
		for(i=1;i<=100;i++)
		{
			count=0;
			a=i;
			for(p=1;p<=a;p++)
			{
				if(a%p==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				System.out.println(a);
			}
		}
	}

}
