import java.util.Scanner;
class PrimeNumber 
{
	static int primeCheck=0;
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		for (int i=2;i<=input-1;i++)
		{
			if (input%i==0)
			{
				primeCheck=primeCheck+1;
			}
		}
		if (primeCheck>0)
		{
			System.out.println("number is not prime number");
		}
		else {

			System.out.println("number is prime number");
			
		}
			


	}
}
