package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Repeated-Deletion
 *
 * // not solved
 *
 */

public class RepeatedDeletion {
    public static void main(String[] args) {
        String s0 = "abbbaac";
        String s1 = "ywwyfbblaxgvweizrxmnzmtcckgkbgtecelryrgxwgfbbnquudfeyruuukieiyvwshjsfqbqyliphmw";

        System.out.println("Output:   " + solve(s0)); // c
        System.out.println("Expected: " + "c");
        System.out.println("Output:   " + solve(s1)); // flaxgvweizrxmnzmtkgkbgtecelryrgxwgfnqdfeyrkieiyvwshjsfqbqyliphmw
        System.out.println("Expected: " + "flaxgvweizrxmnzmtkgkbgtecelryrgxwgfnqdfeyrkieiyvwshjsfqbqyliphmw");
    }

    private static String solve(String s) {
        StringBuilder str = new StringBuilder(s);

        boolean wasDeletion = true;
        while (wasDeletion) {
            wasDeletion = false;
            for (int i = 0; i < str.length() - 1; i++) {
                StringBuilder repeated = new StringBuilder();
                repeated.append(str.charAt(i));
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == repeated.charAt(0)) {
                        repeated.append(str.charAt(j));
                    } else {
                        break;
                    }
                }
                System.out.println(str + " " + repeated);
                if (repeated.length() > 1) {
                    str = new StringBuilder(str.toString().replace(repeated, ""));
                    wasDeletion = true;
                }
            }
        }

        return str.toString();
    }
}
