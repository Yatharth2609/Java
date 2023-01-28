import java.net.CookieHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo
{
    public static void main(String[] args) {

        List<Integer> Is = Arrays.asList(12,54,64,23253,53,2321,53,31,64,65);
        System.out.println(Is);

        System.out.println(Collections.max(Is));
        System.out.println(Collections.min(Is));


    }
}
