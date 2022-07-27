// Program to show hierarchical level inheritance

class Animal{
    void eat(){System.out.println("Eating");}
}

class Dog extends Animal{
    void sound(){System.out.println("Dog barks"); }
}

class Cat extends Animal{
    void sound(){System.out.println("Cat Meow");}
}

public class Test_Inheritance {
    public static void main(String[] args) {
        
        Dog d=new Dog();
        d.eat();
        d.sound();
        Cat c=new Cat();
        c.eat();
        c.sound();
    }
}

 




/*// Program to show multilevel inheritance.

class Animal{
    void eat(){System.out.println("Eating");}
}

class Dog extends Animal{
    void sound(){System.out.println("Dog barks"); }
}

class Puppy extends Dog{
    void name(){System.out.println("Name Pug"); }
}

public class Test_Inheritance {
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.sound();
        p.name();
    }
}
*/


// Program to show single level inheritance

/*class Animal{
    void eat(){System.out.println("Eating");}
}

class Dog extends Animal{
    void sound(){System.out.println("Dog barks"); }
}

public class Test_Inheritance {
    public static void main(String[] args) {
        
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}

 */

 