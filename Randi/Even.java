//Write a Java program (using function) to print the even numbers from a given list.
import java.util.Scanner;
public class Even {
    void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Even obj=new Even();
        System.out.println("The even numbers are");
        obj.display(a);
        sc.close();
    }
}
