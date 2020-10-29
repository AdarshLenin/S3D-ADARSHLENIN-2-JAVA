
public class Fibonacci {
	public static void main(String[] args)
	{
		int n=30,f1=0,f2=1;
		System.out.println("The fibonnacci series of "+ n + "terms is");
		
	for(int i=0;i<=n;i++)
	{
		System.out.println(f1  +" ");
		int s=f1+f2;
		f1=f2;
		f2=s;
	}
	}
}
