
public class Primenumber {
	public static void main(String[] args)
	{
		int n=7,flag=1;
		for(int i=2;i<n;i++)
			if(n%i==0)
				flag=1;
				
			else
				flag=0;
				
		if(flag==1)		
			System.out.println("The number "+n+" is not prime number");
		else
			System.out.println("The number "+n+" is a prime number");
	}

}
