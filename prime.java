//Write a Java function (using function) that checks whether a given number is prime or not
//(Note : function type - with arguments with return values)
import java.util.Scanner;
public class prime {
    int prime_check(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        prime obj=new prime();
        int result=obj.prime_check(n);
        if(result==1)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}
