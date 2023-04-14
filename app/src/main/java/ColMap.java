import java.util.*;
import static java.lang.System.out;

public class ColMap {
    public static void main(String args[]) {
        TreeMap<Integer, Integer> mp = new TreeMap<>() {{
            put(1, 0);
            put(2, 2);
            put(3, 2);
            put(10, 9);
        }};
        out.println(mp);
        out.println(mp.containsKey(1));
        out.println(mp.lastEntry());
        out.println();


    }
}
