package Singlton;

import java.util.*;


public class MapExample {

    public static void main(String[] args) {
        String text = "tools toys test for_test before_test alphabet enter another ";

        calculateText(text);

        List<String> col = new ArrayList<String> (Arrays.asList("one", "two", "three", "two"));
        System.out.println(hasDuplicates(col));

    }

    private static void calculateText(String text) {
        String[] word = text.split("\\W+");
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            String firstLetter = word[i].substring(0, 1);
            if (!m.containsKey(firstLetter)) {
                m.put(firstLetter, 0);
            }
            m.put(firstLetter, m.get(firstLetter) + 1);
        }
        for (String key : m.keySet()) {
            System.out.print(key + "=" + m.get(key) + ",");
        }
    }

    private static boolean hasDuplicates(Collection col) {
        //Set set = (Set) col.stream().collect(Collectors.toSet());
        //return set.size() != col.size();

        Set set1 = new HashSet();
        for (Object item: col) {
            set1.add(item);
        }

        return set1.size() != col.size();
    }



}

