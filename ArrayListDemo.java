import java.util.*;

public class ArrayListDemo
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int[] MyArray = getValues(5);

        for (int i = 0; i < MyArray.length; i++) {
            System.out.println("Value of " + i + " is " + MyArray[i]);
        }

        System.out.println(getAvg(MyArray));
    }

       public static int[] getValues( int num)
        {
            int[] values = new int[num];

            for (int i = 0; i < values.length; i++) {
                values[i] = sc.nextInt();
            }

            return values;
        }

        public static int getAvg ( int[] ex)
        {
            int sum = 0;
            for (int i = 0; i < ex.length; i++) {
                sum += ex[i];
            }

            return (sum / ex.length);
        }

}
