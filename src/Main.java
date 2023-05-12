import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }
    private static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(10,1,3,4,5,6,9,8));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);
    }

    private static void task3() {
        System.out.println("Задача 3");
        List<String> str = new ArrayList<>(List.of("qqq", "qqq", "eee", "eee","www"));
        Set<String> set = new HashSet<>(str);
        System.out.println(set);

    }
    private static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        System.out.println(map.values());
    }
}