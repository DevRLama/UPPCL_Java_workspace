/* superclass Person */
class Person
{
    Person()
    {
        System.out.println("Person class Constructor");
    }
}
  
/* subclass Student extending the Person class */
class Student11 extends Person
{
    Student11()
    {
        // invoke or call parent class constructor
        super();
  
        System.out.println("Student class Constructor");
    }
}
  
/* Driver program to test*/
class Test_Constructor
{
    public static void main(String[] args)
    {
        Student11 s = new Student11();
    }
}