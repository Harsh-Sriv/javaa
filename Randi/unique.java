//Write a Java program using function to count unique values in an array of 15 elements.
import java.util.Scanner;
public class unique {
    void count(int a[])
    {
        int u,c=0;
        for(int i=0;i<a.length;i++)
        {
            u=a[i];
            boolean flag=false;
            for (int j=0;j<a.length;j++)
            {
                if(u==a[j] && i!=j)
                {
                    flag=true;
                    break;
                }
            }
            if (!flag)
            {
                c++;
            }
        }
        System.out.println("The number of unique values are "+c);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[15];
        for(int i=0;i<15;i++)
        {
            a[i]=sc.nextInt();
        }
        unique obj=new unique();
        obj.count(a);
        sc.close();
    }
}
