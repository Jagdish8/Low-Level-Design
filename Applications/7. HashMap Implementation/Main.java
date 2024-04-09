import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map= new MyHashMap<>();
        map.put(5, 10);
        System.out.println(map.get(5));
        System.out.println(map.get(1));
        map.put(5, 11);
        map.put(10,1);
        System.out.println(map.get(5));
        System.out.println(map.get(10));
        System.out.println(map.get(10));

    }
}
