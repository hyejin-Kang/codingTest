package algorithm_stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();

        st.push("1");
        st.push("32");
        st.push("17");
        st.push("89");

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
