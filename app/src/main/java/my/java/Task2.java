package my.java;

import java.util.HashSet;
import java.util.HashMap;

public class Task2 {
    public static HashMap<Character, Integer> getLetterEntries(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        return map;
    }

    public static HashSet<Character> getDuplicateLetters(HashMap<Character, Integer> map) {
        HashSet<Character> set = new HashSet<>();
        for (Character key : map.keySet()) if (map.get(key) > 1) set.add(key);
        return set;
    }

    public static void run(String line) {
        HashSet<Character> set = getDuplicateLetters(getLetterEntries(line));
        if (!set.isEmpty()) {
            for (Character letter : set) System.out.print(letter + " ");
            System.out.println();
        }
    }
}
