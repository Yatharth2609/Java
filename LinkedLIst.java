package LinkedLIst;

public class LinkedLIst
{
    public static class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //Step 1 ->
        Node newNode = new Node(data);
        size++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //Step 2 ->
        newNode.next = head; // Linking

        //Step 3 ->
        head = newNode;
    }

    public void addLast(int data)
    {
        //Step1 ->
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            tail = head = newNode;
            return;
        }

        //Step2 ->
        tail.next = newNode;

        //Step3 ->
        tail = newNode;
    }

    public void addMiddle(int index, int data)
    {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < (index - 1))
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is Empty!!");
            return Integer.MIN_VALUE;
        }
        else if (size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static int removeLast()
    {
        if(size == 0)
            System.out.println("LL is Empty!!");

        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0 ; i < size - 2 ; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;

    }

    public static int search(int tar)
    {
        if(head.data == tar)
        {
            return 0;
        }

        Node temp = head;

        for (int i = 0; i < size; i++)
        {
            if(temp.data == tar)
                return i;
            temp = temp.next;
        }

        return -1;
    }
    public static int helper(Node head, int tar)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == tar)
            return 0;
        int idx = helper(head.next, tar);
        if(idx == -1)
            return -1;

        return idx + 1;
    }

    public static void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;

    }

    public static void deleteNthFromEnd(int n)
    {
        int sz = 0;
        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        if(sz == n)
        {
            head = head.next;
        }

        int i = 1;
        int des = sz - n;
        Node prev = head;
        while(i < des)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public static int recSearch(int tar)
    {
        return helper(head,tar);
    }

    public void printLL()
    {
        if(head == null)
        {
            System.out.println("LinkedList is empty!!");
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findMid(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static boolean checkPalindrome()
    {
        if(head == null || head.next == null)
            return true;

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;

        while(right != null)
        {
            if(left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
      return true;
    }
    public static boolean cycle_loop()
    {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void removeCycle()
    {
        Node fast = head;
        Node slow = head;
        boolean cycle = false;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle)
            return;

        slow = head;
        Node prev = null;
        while (slow != fast)
        {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
            return head;

        Node mid = findMid(head);
        Node Rhead = mid.next;
        Node Lhead = head;
        mid.next = null;

        Node nRhead = mergeSort(Rhead);
        Node nLhead = mergeSort(Lhead);

        return merge(nLhead,nRhead);
    }

    public static Node merge(Node nLhead, Node nRhead)
    {
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;

        while (nLhead != null && nRhead != null)
        {
            if(nLhead.data <= nRhead.data)
            {
                temp.next = nLhead;
                nLhead = nLhead.next;
                temp = temp.next;
            }

            else
            {
                temp.next = nRhead;
                nRhead = nRhead.next;
                temp = temp.next;
            }
        }

        while (nLhead != null)
        {
            temp.next = nLhead;
            nLhead = nLhead.next;
            temp = temp.next;
        }

        while (nRhead != null)
        {
            temp.next = nRhead;
            nRhead = nRhead.next;
            temp = temp.next;
        }

        return MergedLL.next;
    }

    public static void Zig_Zag()
    {
        // Finding Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // Reversing 2nd Half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate Merging

        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;

        while (left != null && right != null)
        {
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = left;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        LinkedLIst ll = new LinkedLIst();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        System.out.println("-------After Zig-Zag-------");
        Zig_Zag();
        ll.printLL();


    }
}


