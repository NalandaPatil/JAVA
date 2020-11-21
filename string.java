import java.util.Scanner;

class string {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);    
    System.out.print("Enter first string: ");  
    String first= sc.nextLine();              //reads string   
    System.out.print("You have entered: "+first); 

    System.out.print("\nEnter second string: ");  
    String second= sc.nextLine();              //reads string   
    System.out.print("You have entered: "+second); 
    
    //length of strings
    int length = first.length();
    System.out.println("Length of string: " + length);
    
    //joining two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result1);
    
    //get character 
    System.out.println(first.charAt(2));
    
    //convert to lower case
    System.out.println(first.toLowerCase());
    
    //convert to upper case
    System.out.println(first.toUpperCase());
  }
}