import java.util.Scanner;
class ReverseInteger
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int k=num%10;
			sum=sum*10+k;
			num=num/10;
		}
		System.out.println(sum);
	}
}