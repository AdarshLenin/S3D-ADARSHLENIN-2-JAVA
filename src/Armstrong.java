
public class Armstrong {
public static void main(String[] args)
{
	int num=407,rem,sum=0;
	int check=num;
	while(num!=0)
	{
		rem=num%10;
		sum=sum+rem*rem*rem;
		num/=10;
	}
	if(check==sum)
		System.out.println("The number is armstrong");
	else
		System.out.println("The number is not Armstrong");
	
}
}
