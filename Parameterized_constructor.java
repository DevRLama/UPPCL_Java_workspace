// Program to demonstrate the parameterized constructor.

class Addition{
    Addition(int a,int b){
        System.out.println(a+b);
    }
    Addition(int a,int b,int c){
        System.out.println(a+b+c);
    }

Addition(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }
}



class Parameterized_constructor {
    public static void main(String[] args) {
        Addition a1=new Addition(10, 20);
        Addition a2=new Addition(10, 20,30);
        Addition a3=new Addition(10, 20, 30, 40);
    }
}
