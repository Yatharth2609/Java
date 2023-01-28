package Stack;

import java.util.ArrayList;

public class Stack_ArrList
{
    static class Stack
    {
        static ArrayList<Integer> stack = new ArrayList<>();

        public static boolean isEmpty()
        {
            if(stack.size() == 0)
                return true;
            return false;
        }

        public static void push(int data)
        {
            stack.add(data);
        }

        public static int pop()
        {
            int top = stack.get(stack.size() -1);
            stack.remove(stack.size()-1);
            return top;
        }

        public static int peek()
        {
            return stack.get(stack.size()-1);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty())
        {
            System.out.println(s.peek() + " ");
            s.pop();

        }
    }

}
