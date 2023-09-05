//Write a Java program to find the digits which are absent in a given mobile number (using function)
import java.util.Scanner;
public class digits {
    void absent_digits(String s)
    {
        int a[]=new int[10];
        for(int i=0;i<s.length();i++)
        {
            int n=s.charAt(i)-48;
            a[n]=1;
        }
        System.out.println("The absent digits are");
        for(int i=0;i<10;i++)
        {
            if(a[i]==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mobile number");
        String s=sc.nextLine();
        digits obj=new digits();
        obj.absent_digits(s);
        sc.close();
    }
}