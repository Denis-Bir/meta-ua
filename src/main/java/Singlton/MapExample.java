package Singlton;

import java.util.HashMap;
import java.util.Map;



public class MapExample {

    public static void main(String[] args) {
        String text = "tools toys test for_test before_test alphabet enter another ";
        calculateText(text);

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


    //private static boolean hasDuplicates(Collection col) {
    


}

