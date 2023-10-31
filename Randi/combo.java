//Write a Java program using function to print all Possible Combinations from the three Digits
import java.util.Scanner;
public class combo {
    void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                for(int k=0;k<a.length;k++)
                {
                    if(i!=j && j!=k && k!=i)
                    {
                        System.out.println(a[i]+""+a[j]+""+a[k]);
                    }
                }
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        System.out.println("Enter the three digits");
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>9 || a[i]<0)
            {
                System.out.println("Enter a valid digit");
                i--;
            }
        }
        combo obj=new combo();
        System.out.println("The combinations are");
        obj.display(a);
        sc.close();
    }
}
