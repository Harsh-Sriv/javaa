/*/Write a Java program (using function) to check if two strings are rotationally equivalent.

Sample Output
string 1 is : srmist
string 2 is : tsrmis
Are two strings Rotationally equal ? : True*/
import java.util.Scanner;
public class rotate {
    boolean roataion_check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            String s3=s1+s1;
            if(s3.contains(s2))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the first string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        rotate obj=new rotate();
        boolean result=obj.roataion_check(s1,s2);
        if(result==true)
        {
            System.out.println("Are two strings Rotationally equal ? : True");
        }
        else
        {
            System.out.println("Are two strings Rotationally equal ? : False");
        }
        sc.close();
    }
}
