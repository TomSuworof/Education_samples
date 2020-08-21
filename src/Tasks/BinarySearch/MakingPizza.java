package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Making-pizza
 */

public class MakingPizza {
    public static void main(String[] args) {
        String s0 = "pihzzatpizza";
        String s1 = "zp";

        System.out.println(solve(s0)); // 2
        System.out.println(solve(s1)); // 0
    }

    private static int solve(String s) {
        int countP = 0, countI = 0, countZ = 0, countA = 0;

        for (char letter : s.toCharArray()) {
            switch (letter) {
                case 'p' -> countP++;
                case 'i' -> countI++;
                case 'z' -> countZ++;
                case 'a' -> countA++;
            }
        }
        countZ /= 2;

        return Math.min(Math.min(countP, countI), Math.min(countZ, countA));
    }
}
