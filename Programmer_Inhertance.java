class Employee {      // parent class
    float salary=4000;}

class Programmer_Inheritance extends Employee{ //child class inherit parent class with extends keyword.
        int bonus=1000;
        public static void main(String[] args) {
            Programmer_Inheritance p=new Programmer_Inheritance();
            System.out.println("Programmer salary is:"+p.salary);
            System.out.println("Bonus is: "+p.bonus);
        }
    }
