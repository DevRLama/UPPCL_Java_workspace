package Assignment;


class Person {
    private String name; // private = restricted access
    private int age;
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

    public int getAge() {
        return age;
      }
    
      // Setter
      public void setAge(int newAge) {
        this.age = newAge;
      }
  }
public class Get_set_method {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Amit Yadav");
        p1.setAge(20);
        System.out.println("Your name is : "+p1.getName()+"and Age is :"+p1.getAge());
        
    }
    
}
