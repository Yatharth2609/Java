package LinkedLIst;

public class DoublyLL
{
    public class Node
    {
        int data;
        Node next;
        Node prev;

        public Node (int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data)
    {
        Node temp = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = temp;
            return;
        }

        temp.next = head;
        temp.prev = null;
        head.prev = temp;
        head = temp;
    }

    public void addLast(int data)
    {
        Node temp = new Node(data);
        size++;

        if (head == null)
        {
            head = tail = temp;
        }

        temp.next = null;
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
    }

    public int removeFirst()
    {
        if(size == 1)
    {
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }

       int val = head.data;

       head = head.next;
       head.prev = null;
       size--;
       return val;
    }

    public int removeLast()
    {
        if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val =  tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }

    public void printDll()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void reverse()
    {
        Node curr = head;
        Node next;
        Node tprev = null;

        while (curr != null)
        {
            next = curr.next;
            curr.next = tprev;
            curr.prev = tprev;
            tprev = curr;
            curr = next;

        }
    }

    public static void main(String[] args) {

        DoublyLL Dll = new DoublyLL();

        Dll.addLast(6);
        Dll.addLast(5);
        Dll.addLast(4);
        Dll.addLast(3);
        Dll.addLast(2);
        Dll.addLast(1);

        Dll.removeFirst();
        Dll.removeLast();
        Dll.printDll();
    }
}
