import java.util.Scanner;  
class SumOfDigits   
{  
	public static void main(String args[])  
	{   
		Scanner in = new Scanner(System.in);  
		int num, digit, sum = 0; 
		System.out.print("Enter the number: ");  
		num = in.nextInt();  
		while(num > 0)  
		{  
    
			digit = num % 10;  

			sum = sum + digit;  
 
			num = num / 10;  
		}  
  
		System.out.println("Sum of Digits: "+sum);  
	}  
}  