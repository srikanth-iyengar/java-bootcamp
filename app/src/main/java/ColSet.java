import java.util.*;
import static java.lang.System.out;

public class ColSet {

    public static void main(String args[]) {
        TreeSet<Integer> st = new TreeSet<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
            add(11);
            add(12);
            add(13);
        }};
        out.println(st);
        out.println(st.contains(1));
        out.println(st.contains(100));
        out.println(st.ceiling(6));
        out.println(st.floor(6));
        out.println(st.ceiling(100));























        HashSet<Integer> hs = new HashSet<>(){{
            add(13);
            add(17);
            add(4);
            add(7);
            add(1);
            add(2);
            add(3);
            add(5);
            add(6);
            add(8);
            add(9);
            add(10);
            add(11);
            add(12);
            add(14);
            add(15);
            add(16);
        }};
        // out.println(hs);
        // out.println(hs.contains(1));
        // out.println(hs.contains(100));
        // out.println(hs.size());
    }
}
