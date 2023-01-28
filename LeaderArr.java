import java.util.ArrayList;

public class LeaderArr
{
    public static void leader(int[] arr)
    {
        int max  = arr[arr.length -1];
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = arr.length - 2 ; i >= 0 ; i--)
        {
            if(max < arr[i]) {
                max = arr[i];
                l.add(max);
            }
        }

       System.out.println(l);
    }

    public static void main(String[] args) {
        int[] arr = {17,13,14,5,9,2};
        leader(arr);
    }
}
