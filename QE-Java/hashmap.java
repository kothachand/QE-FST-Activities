import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> a=new HashMap();
        a.put(1,"red");
        a.put(2,"yellow");
        a.put(3,"blue");
        a.put(4,"orange");
        a.put(5,"white");

        a.remove(1);
        System.out.println(a.containsValue("red"));
        System.out.println(a);
        System.out.println(a.size());
    }
    
}
