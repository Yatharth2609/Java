import java.util.Scanner;

public class ReverseArr
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        int[] myArray = getElements(n);
        System.out.println("Array before Reversing:");
        PrintArray(myArray);
        System.out.println("Array after reversing:");
        PrintArray(reverse(myArray));

    }

    public static void PrintArray(int[] Array)
    {
        for (int i=0;i<Array.length;i++)
        {
            System.out.println("value at " + i + " is " + Array[i]);
        }
    }
    public static int[] getElements(int size)
    {
        int[] values = new int[size];

        for (int i=0; i<values.length;i++)
        {
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static int[] reverse(int[] Array)
    {
        int temp = 0;
        for (int i=0;i < Array.length /2;i++)
        {
            temp = Array[i];
            Array[i] = Array[(Array.length - 1) - i];
            Array[(Array.length - 1) - i] = temp ;

        }

        return Array;
    }

}
