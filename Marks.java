import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
  int a;
  Scanner num=new Scanner(System.in);
  System.out.println("Please Enter the marks :");
  a=num.nextInt();
  if(a>40){
       System.out.println("The student is Pass");
  }
  else{
       System.out.println("The student is Fail");
  }
}
}