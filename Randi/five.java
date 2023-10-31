//Write a Java program using function that will return true if the two given integer values are equal or their sum or difference is 5.
import java.util.*;
public class five {
    void check(int a,int b)
    {
        if(a==b || a+b==5 || a-b==5)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        five obj=new five();
        obj.check(a,b);
        sc.close();
    }
}
