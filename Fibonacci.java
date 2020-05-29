import java.util.Scanner;
class  Fibonacci
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int res;
		for (int i=1;i<=num;i++)
		{
			res=a+b;
			System.out.println(res);
			a=b;
			b=res;
		}
			
	}
}
