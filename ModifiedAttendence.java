import java.util.Scanner;

public class ModifiedAttendence
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a = sc.nextInt();
        boolean med = sc.nextBoolean();

        float per = (float) (a / t) * 100;

        if ( med)
        {
            System.out.println("Allowed (edical Reasons)");
        }

        else
        {
            if (per < 75) {
                System.out.println("Not allowed - Attendance: " + per);
            }

            else {
                System.out.println("Allowed - Attendance: " + per);
            }
        }

    }
}
