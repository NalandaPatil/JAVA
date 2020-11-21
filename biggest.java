import java.util.Scanner;
public class biggest {

    public static void main(String[] args) {

        int n1 , n2 , n3 ;
        Scanner num=new Scanner(System.in);
        System.out.println("please Enter first number");
        n1=num.nextInt();
        System.out.println("please Enter second number");
        n2=num.nextInt();
        System.out.println("please Enter third number");
        n3=num.nextInt();

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}