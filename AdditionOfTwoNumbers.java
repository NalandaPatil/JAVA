import java.util.Scanner;
class add
{
public static void main(String args[])
{
try
{
int a,b,c;
Scanner num=new Scanner(System.in);
System.out.println("please Enter first number");
a=num.nextInt();
System.out.println("please Enter second number");
b=num.nextInt();
c=a+b;
System.out.println(" Addition of two numbers is : "+c);
}
catch(Exception e)
{System.out.println("Error: "+e);}
}

}
