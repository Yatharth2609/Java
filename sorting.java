import java.util.*;

public class sorting
{

    public static Scanner sc =new Scanner (System.in);

    public static void main(String[] args) {

        int [] myArray = getValues(5);
        System.out.println("*****Array before Sorting******");
        PrintArray(myArray);

        int[] sortedArray = sort(myArray);
        System.out.println("*****Array after Sorting*****");
        PrintArray(sortedArray);

    }

    public static int[] getValues(int size)
    {
        int[] values = new int[size];

        for (int i=0; i<values.length; i++)
        {
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static void PrintArray(int[] Array)
    {
        for(int i = 0 ; i< Array.length ; i++)
        {
            System.out.println("Value of " + i + " is " + Array[i]);
        }
    }

    public static int[] sort(int[] Array)
    {
        int temp = 0;
        for(int i = 0 ; i <= Array.length ; i++)
        {
            for (int j = i+1 ; j < Array.length ; j++)
            {
                if (Array[i] < Array[j])
                {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        return Array;
    }


}
