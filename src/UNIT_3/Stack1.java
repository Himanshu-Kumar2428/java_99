package UNIT_3;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("First");
        stk.push("Second");
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.size());



    }
}
