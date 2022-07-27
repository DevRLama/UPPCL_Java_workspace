// Example of Aggregation.

class Operation {
    int square(int n){
        return n*n;
    }
}

class circle{
    Operation op;
    double pi=3.14f;
    double area(int radius){
        op=new Operation();
        int r_square=op.square(radius);
        return pi*r_square;
    }
    public static void main(String[] args) {
        circle c1=new circle();
        double result=c1.area(5);
        System.out.println(result);
    }
}
