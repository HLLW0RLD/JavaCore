package lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    public static void main(String[] args) {

        Numbers pb = new Numbers();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get("Petrov"));
    }

    static class Numbers {

        private Map<String, HashSet<String>> map;

        Numbers() {
            this.map = new HashMap<>();
        }

        void add(String lastName, String phone) {
            HashSet<String> numbers;

            if (map.containsKey(lastName)) {
                numbers = map.get(lastName);
            } else {
                numbers = new HashSet<>();
            }
            numbers.add(phone);
            map.put(lastName, numbers);

        }

        Set<String> get(String lastName) {
            return map.get(lastName);
        }
    }
}
