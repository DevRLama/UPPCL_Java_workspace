class Student
{
    int roll_no;
    String name;
    static String college="xyz";

    Student(int r, String n)
    {
        roll_no=r;
        name=n;
    }
    void display()
    {
        System.out.println(roll_no+" " +name+ " " + college);
    }
  /*   public static void main(String args[])
    {
        Student s1=new Student();   // Initialisation of object with the help of new keyword.
        System.out.println(s1.id);
        System.out.println(s1.name);
    } */
}

public class Student1
{
    public static void main(String[] args) {
        Student.college="ghi";
        Student s1= new Student(1, "abc");
        Student s2= new Student(2, "def");
        s1.display();
        s2.display();
        
    }
}