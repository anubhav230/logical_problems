import java.util.Scanner;
class Factorial 
{
	static int factr=1;
	void fact(int i){
	if (i>1)
		{
			factr=factr*i;
			fact(i-1);
		}
		
		
	}

	public static void main(String[] args) 
	{
		Factorial f=new Factorial();

		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		f.fact(n);
		System.out.println(factr);
		
		

	}

}
