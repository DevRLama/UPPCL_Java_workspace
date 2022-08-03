package Data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack_Ex {
    int[] arr_stack=new int[10];
    int top=-1;

    public void push(int element)
    {
        top=top+1;
        arr_stack[top]=element;
    }
    public int pop()
    {
        int elem=arr_stack[top];
        top=top-1;
        return elem;

    }
    
    public static void main(String[] args) throws IOException {
        
        Stack_Ex s1=new Stack_Ex();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             
        while(true)
        {
            System.out.println("Press\n1. Push\n2.Pop\n3.Peek\n4. Show Stack\n5. Exit");
            int choice=Integer.parseInt(br.readLine());           
            switch(choice)
            {
                case 1:
                if(s1.top==10)
                {
                    System.out.println("Stack is Full !");
                }else{
                    System.out.println("Enter element to push.");
                    s1.push(Integer.parseInt(br.readLine()));
                }
                break;

                case 2:
                if(s1.top==-1)
                {
                    System.out.println("Stack is empty !");
                }else{
                System.out.println("Pop element from Stack is: "+s1.pop());
                }
                break;

                case 3:
                if(s1.top==-1)
                {
                    System.out.println("No element found  stack is empty");
                }else{
                    System.out.println("Top element on the stack is: "+s1.arr_stack[s1.top]);
                }
                break;

                case 4:
                if(s1.top==-1)
                {
                    System.out.println("Stack is empty !");
                }else{
                    System.out.println("Stack is:\n");
                    
                    for(int i=s1.top;i>=0;i--)
                    {
                        if(i==s1.top)
                        {
                            System.out.println("| "+s1.arr_stack[i]+" | <-----Top");
                        }else
                        {
                            System.out.println("| "+s1.arr_stack[i]+" |");
                        }
                        
                        System.out.println(" ____");
                    }
                    
                }
                break;
                case 5:
                    System.out.println("Thank You. Have a Good Day");
                break;

                default:
                System.out.println("Not valid choice");
          
            }
            if(choice==5)
            break;

        }
    }
}
