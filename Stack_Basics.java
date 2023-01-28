package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Basics
{
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static StringBuilder reverseStr(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder("");
        while (!s.isEmpty())
        {
            res.append(s.pop());
        }

        return res;
    }

    public static void reverseStack(Stack<Integer> s)
    {
        if (s.isEmpty())
            return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void stockSpan(int[] stocks, int[] span)
    {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1 ; i < stocks.length ; i++)
        {
            while (!s.isEmpty() && (stocks[i] > s.peek()))
            {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            }
            else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void nextGreater(int[] arr, int[] ng)
    {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1 ; i >= 0; i--)
        {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
            {
                s.pop();
            }

            if (s.isEmpty())
            {
                ng[i] = -1;
            }

            else
            {
                ng[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static boolean isValid(String str)
    {
        Stack<Character> s = new Stack<>();

        for (int i =0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            {
                s.push(str.charAt(i));
            }
            else
            {
                if(s.isEmpty())
                    return false;
                if((s.peek() == '(' && str.charAt(i) == ')') ||
                        (s.peek() == '[') && str.charAt(i) == ']' ||
                        (s.peek() == '{') && str.charAt(i) == '}')
                {
                    s.pop();
                }
            }
        }

        if (!s.isEmpty())
            return false;
        return true;
    }

    public static boolean isDuplicate(String str)
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++)
        {
            // Closing
            if(str.charAt(i) == ')')
            {
                int c = 0;
                while (s.peek() != '(')
                {
                    s.pop();
                    c++;
                }
                if(c < 1)
                    return true;
                else
                    s.pop();
            }
            else
            {
                s.push(str.charAt(i));
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        int[] arr = {6, 8, 0, 1, 3};
        int[] ng = new int[arr.length];

        String str = "(((a+b)+(c+d)))";
        System.out.print(isDuplicate(str));

    }
}
