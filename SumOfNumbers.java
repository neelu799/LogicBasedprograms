import java.util.Scanner;
class SumOfNumbers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int k=num%10;
			if(k%3==0)
				sum=sum+k;
			num=num/10;
		}
		System.out.println(sum);
	}
}