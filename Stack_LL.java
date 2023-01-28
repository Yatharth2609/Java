package Stack;

public class Stack_LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty())
            {
                head = newNode;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop()
        {
            if(isEmpty())
                return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek()
        {
            if(isEmpty())
                return -1;
            
            return head.data;
        }
    }
}



