package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Repeated-Deletion
 */

public class RepeatedDeletion {
    public static void main(String[] args) {
        String s0 = "abbbaac";
        String s1 = "ywwyfbblaxgvweizrxmnzmtcckgkbgtecelryrgxwgfbbnquudfeyruuukieiyvwshjsfqbqyliphmw";
        String s2 = "xkufknqvuiefxcsldwuqigdzurqanigbicmtpznyyyykfnndcsjbzztyzlvwv";

        System.out.println("Output:   " + solve(s0)); // c
        System.out.println("Expected: " + "c");

        System.out.println("Output:   " + solve(s1)); // flaxgvweizrxmnzmtkgkbgtecelryrgxwgfnqdfeyrkieiyvwshjsfqbqyliphmw
        System.out.println("Expected: " + "flaxgvweizrxmnzmtkgkbgtecelryrgxwgfnqdfeyrkieiyvwshjsfqbqyliphmw");

        System.out.println("Output:   " + solve(s2)); // xkufknqvuiefxcsldwuqigdzurqanigbicmtpznkfdcsjbtyzlvwv
        System.out.println("Expected: " + "xkufknqvuiefxcsldwuqigdzurqanigbicmtpznkfdcsjbtyzlvwv");
    }

    private static String solve(String s) {
        String ans = "" + s.charAt(0);
        char lastDeleted = ' ';
        for (int i = 1; i < s.length(); i++) {
            System.out.println(ans + " " + s.charAt(i) + " " + lastDeleted);
            if (ans.length() != 0) {
                if (ans.charAt(ans.length() - 1) == s.charAt(i)) {
                    lastDeleted = ans.charAt(ans.length() - 1);
                    ans = ans.substring(0, ans.length() - 1);
                    continue;
                }
            }
            if (s.charAt(i) != lastDeleted) {
                ans += s.charAt(i);
                lastDeleted = ' ';
            }
        }
        return ans;
    }
}
