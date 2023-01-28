import java.util.*;

public class MinElement
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
     System.out.println("Enter the length of the Array:");
     int n = sc.nextInt();
     int[] myArray = getElements(n);
     PrintArray(myArray);
     System.out.println("Minimun Element in Array is:" + minElement(myArray));

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

    public static void PrintArray(int[] Array)
    {
        for (int i=0;i<Array.length;i++)
        {
            System.out.println("value at " + i + " is " + Array[i]);
        }
    }

    public static int minElement(int[] Array)
    {
        int min = Array[0];
        for (int i=0;i<Array.length;i++)
        {
            if(Array[i] < min)
            {
                min  = Array[i];
            }
        }

        return min;
    }
}
