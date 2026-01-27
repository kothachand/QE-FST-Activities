import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println(h.size());
        h.remove(2);
        System.out.println(h.size());
        System.out.println(h.contains(3));
        System.out.println(h.remove(10));
        System.out.println(h);
    }
}
