class MethodOverloading {

    

    private static void display(int a){
        System.out.println("Engineering college");
        System.out.println("State rank: " + a);
    }
    // Method with different number of parameters
    private static void display(int a, int b){
        System.out.println("Number of Degree students: " + a + "\nNumber of P.G students:" + b);
    }
     // This method accepts String object
    private static void display(String a){
        System.out.println("Institute cluster: "+a);
    }

    public static void main(String[] args) {
        display(135);
        display(2650,250);
        display("Palghar");
    }
}