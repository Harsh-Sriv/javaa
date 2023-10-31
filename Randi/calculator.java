//simple mini calculator program in C++ that uses subroutines for basic arithmetic operations
import java.util.Scanner;
public class calculator {
    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        calculator obj=new calculator();
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the operation to be performed");
        char c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println(obj.add(a,b));
            break;
            case '-':
            System.out.println(obj.sub(a,b));
            break;
            case '*':
            System.out.println(obj.mul(a,b));
            break;
            case '/':
            System.out.println(obj.div(a,b));
            break;
            default:
            System.out.println("Invalid operation");
        }
        sc.close();
    }
}
