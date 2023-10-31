////simple mini calculator program in C++ that uses subroutines for basic arithmetic operations
#include<iostream>
using namespace std;
int add(int a, int b)
{
    return a+b;
}
int sub(int a, int b)
{
    return a-b;
}
int mul(int a, int b)
{
    return a*b;
}
int divi(int a, int b)
{
    return a/b;
}
int mod(int a, int b)
{
    return a%b;
}
int main()
{
    int a,b;
    char op;
    cout<<"Enter two numbers: ";
    cin>>a>>b;
    cout<<"Enter operator: ";
    cin>>op;
    switch(op)
    {
        case '+':
            cout<<"Addition is: "<<add(a,b);
            break;
        case '-':
            cout<<"Subtraction is: "<<sub(a,b);
            break;
        case '*':
            cout<<"Multiplication is: "<<mul(a,b);
            break;
        case '/':
            cout<<"Division is: "<<divi(a,b);
            break;
        case '%':
            cout<<"Modulus is: "<<mod(a,b);
            break;
        default:
            cout<<"Invalid operator";
    }
    return 0;
}