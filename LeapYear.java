import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x % 4 == 0 && x % 100 == 0)
        {
            System.out.println("Leap Year");
        } else if (x % 400 == 0 && x % 100 == 0)
        {
            System.out.println("Leap Year");
        }

        else
        {
            System.out.println("Not a Leap Year");
        }

    }
}
