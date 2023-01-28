import java.util.Scanner;

public class Shop
{
    public static void main(String[] args)
    {
        double cost = 0;
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x >= 1000)
        {
            cost = x - (0.1 * x);
        }

        else
        {
            cost = x;
        }

        System.out.println(cost);
    }
}
