public class practice {

    public static void printnum(int k)
    {
        //Base case
        if(k == 0)
        {
            System.out.print(0);
            return;
        }

        System.out.print(k + " ");
        printnum(k-1);
    }

    public static void main(String[] args) {
        printnum(10);
    }
}
