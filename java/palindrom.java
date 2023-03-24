import java.util.*;
class Palindrome
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rev=0,rem;
		int palin=n;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(palin==rev)
		
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}