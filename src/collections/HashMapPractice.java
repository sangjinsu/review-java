package collections;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "hello");
        map.put(2, "jinsu");

        System.out.println("map = " + map);

        Boolean b = map.containsKey(5);
        System.out.println("b = " + b);
        b = map.containsValue("hello");
        System.out.println("b = " + b);
        
        map.remove(5);
        System.out.println("map = " + map);
    }
}
