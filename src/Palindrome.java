
public class Palindrome {
	public static void main(String[] args)
	{
		int num=333,rev=0,rem,check;
		check=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(check==rev)
			System.out.println("The number "+check+" is palindrome");	
		else
			System.out.println("The number "+check+" is not palindrome");
	}
}
