package Data_structure;

public class ReverseString extends Stack_Ex {
    public static void main(String[] args) {
        Stack_Ex s1=new Stack_Ex();
        String str="Helloworl";
        int i=0;
        while(i<str.length())
        {
            s1.push(str.charAt(i));
            i++;
        }
        System.out.print("Reverse String is: ");
        while(s1.top!=-1)
        {
            System.out.print((char)(s1.pop()));
        }
    }
    
}
