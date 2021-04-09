package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Words {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
            a.add("aaa");
            a.add("bbb");
            a.add("ccc");
            a.add("aaa");
            a.add("zzz");
            a.add("bbb");
            a.add("rrr");
            a.add("aaa");
            a.add("ccc");
            a.add("aaa");
        uniqueWords(a);

    }

    private static void uniqueWords(List<String> a) {

        System.out.println(a);
        List<String> b = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            int c = Collections.frequency(a, a.get(i));
            if(c > 1){
                b.add(a.get(i));
            }
        }
        a.removeAll(b);
        System.out.println("Слова встретившиеся один раз: " + a);

        for (int i = 0; i < b.size(); i++){
            int count = 0;
            int unique = 3;
            for (int j = 0; j < b.size(); j++){
                if (b.get(i).equals(b.get(j))){
                    count++;
                }
            }
            if (i < unique){
                System.out.println(b.get(i) +" встречается "+ count + " раз(а)");
            }
        }
    }
}

