//Write a Java program using function to count the number of each character of a given text/string.
import java.util.Scanner;
public class count {
    void count_char(String s)
    {
        int count;
        s=s.toLowerCase();
        for (char i='a';i<='z';i++)
        {
            count=0;
            for (int j=0;j<s.length();j++)
            {
                if (i==s.charAt(j))
                {
                    count++;
                }
            }
            System.out.println("The number of "+i+" in the string "+count);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        count obj=new count();
        obj.count_char(s);
        sc.close();
    }
}
