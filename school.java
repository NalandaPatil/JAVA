public class school{
    public school()
    {
        System.out.println("School student data");
    }
    public school(String name)
    {
        System.out.println("Student name : "+name);
    }
    public school(String Class,int rollno)
    {
      System.out.println("class : "+Class+"\nroll-no : "+rollno);  
    }
    
    public static void main(String[] args) {
        school s1 = new school();
        school s2 = new school("student 1");
        school s3 = new school("tenth",35);
        school ob1 = new school();
        school ob2 = new school("fifth",66);
        school ob3 = new school("student 2");
    }
    
}