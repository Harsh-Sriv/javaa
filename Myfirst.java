import java.util.Scanner;
public class Myfirst {
	public static void main(String[] args) {
		System.out.println("Hello");
		//int n;
		Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
		int[] num=new int[3];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);
		}
	}

}
