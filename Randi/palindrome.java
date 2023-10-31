///Write a Java function (using function) that checks whether a passed string is palindrome or
//not. (Note : function type - No arguments with return values)
import java.util.Scanner;
public class palindrome {
    void palindrome_check(String s)
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        palindrome obj=new palindrome();
        obj.palindrome_check(s);
        sc.close();
    }
}
