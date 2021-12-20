package collections;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("jinsu");

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        list.set(1, "C");
        System.out.println("list = " + list);

        String str = list.get(1);

        str = list.remove(1);
        System.out.println("str = " + str);
        list.clear();

        Boolean b = list.isEmpty();
        System.out.println("b = " + b);

    }
}
