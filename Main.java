//Java go whyne you but no panic

//Now also remember our quote "It's not that deep"
//<---------------Question 5------------->
//Write a Java program to traverse a Stack collection using the foreach loop.
//        HINT: for (int val: stack_list)


//However let's begin
//Normals public class main things
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        //My reason for using the integer is because we are already
        // used to string by now

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(34);
        stack.push(2);
        System.out.print("Stack Elements: ");
        for (int val:stack){
            System.out.print("\t" +val);
        }
    }
}
