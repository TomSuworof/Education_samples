package Multi_threading.Tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperThread {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        reader.close();
        String vowels_str = "";
        String consonant_str = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (isVowel(input.charAt(i))) {
                    vowels_str += input.charAt(i) + " ";
                } else {
                    consonant_str += input.charAt(i) + " ";
                }
            }
        }
        System.out.println(vowels_str);
        System.out.println(consonant_str);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) { // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}