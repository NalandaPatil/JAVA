public class SumEven {
    public static void main(String args[]) {
    int c=0,sum=0;
    int i = 0;
     do {
          c=c+2;
          sum=sum+c;
          i++;
        }
     while (i < 10);
     System.out.println("The sum of first 10 even numbers is "+sum);
    }
}