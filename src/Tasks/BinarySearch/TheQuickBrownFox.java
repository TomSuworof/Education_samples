package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/The-quick-brown-fox
 *
 * So buggy and completely wrong. DO NOT USE IT!
 *
 * not solved
 */

import java.util.HashSet;

public class TheQuickBrownFox {
    public static void main(String[] args) {
        String[] words0 = {"quick", "brown", "the", "fox"};
        String s0 = "thequickbrownfox";

        String[] words1 = {"hello", "world"};
        String s1 = "hellofoobarworld";

        String[] words2 = {"hello", "fooba", "world", "foobar"};
        String s2 = "hellofoobarworld";

        System.out.println(solve(words0, s0)); // true
        System.out.println(solve(words1, s1)); // false
        System.out.println(solve(words2, s2)); // true


//        {
//            String uno = "hello, world";
//            String dos = "hello";
//            System.out.println(uno + " " + dos);
//            if (uno.startsWith(dos) || uno.endsWith(dos)) {
//                uno = uno.replace(dos, "");
//            }
//            System.out.println(uno + " " + dos);
//        }

    }

    private static boolean solve(String[] words, String s) {
        System.out.println("-------------------------------------------------------");

        HashSet<String> words_s = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length && i != j; j++) {
//                System.out.println(words[i] + " " + words[j]);
                if (words[i].startsWith(words[j]) || words[i].endsWith(words[j])) {
                    words[i] = words[i].replace(words[j], "");
                }
            }
        }
        for (String word : words) {
            if (!words.equals("")) {
                words_s.add(word);
            }
        }
        System.out.println(words_s.toString());

        for (String word : words_s) {
            System.out.println(s);
            s = s.replace(word, "");
        }
        System.out.println(s);
        System.out.println("-------------------------------------------------------");
        return s.length() == 0;
    }
}
