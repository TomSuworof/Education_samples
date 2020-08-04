package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Penny-for-Your-Thoughts
 */

public class PennyForYourThoughts {
    public static void main(String[] args) {
        int n0 = 132;
        int n1 = 2;
        int n2 = 100000000;
        int n3 = 50097401;

        System.out.println(solve(n0)); // 1.32
        System.out.println(solve(n1)); // 0.02
        System.out.println(solve(n2)); // 1,000,000.00
        System.out.println(solve(n3)); // 500,974.01
    }

    private static String solve(int n) {
        double nDouble = (double) n / 100;
        StringBuilder answer = new StringBuilder(String.format("%.2f", nDouble).replace(',', '.'));
        answer.reverse();
        int t = 0;
        for (int i = 2; i < answer.length() - 2; i++) {
            if (t++ == 2) {
                answer.insert(i + 2, ',');
                t = 0;
                i++;
            }
        }
        answer.reverse();
        return answer.toString();
    }
}
