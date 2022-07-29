// Interface
interface Animal {
    final int a=20;
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }
  
  // Pig "implements" the Animal interface
  class Pig implements Animal {
    public void animalSound(){
      // The body of animalSound() is provided here
     
      System.out.println("The pig says: wee wee");
    }
    public void sleep(){
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }

  class Dog implements Animal{
      
    public void animalSound(){
      System.out.println("The sound is Boo Boo"+a);
    }

    public void sleep(){
        System.out.println("The dog sleeping Zzzz"+a);
    }


  }
  
  public class Inface_example {
    public static void main(String[] args) {
      Pig myPig = new Pig();  // Create a Pig object
      Dog myDog = new  Dog();
      myPig.animalSound();
      myPig.sleep();
      myDog.animalSound();
      myDog.sleep();
  
    }
  }

