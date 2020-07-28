package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/TV-Shows
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TVShows {
    public static void main(String[] args) {
        String[] shows0 = {"Top Gun", "Aviator", "Top Gun", "Roma", "Logan"};
        int[] durations0 = {5, 3, 5, 13, 4};
        int k0 = 2;

        System.out.println(solve(shows0, durations0, k0)); // 23
    }

    private static int solve(String[] shows, int[] durations, int k) {
        HashMap<String, Integer> data = new HashMap<>();
        for (int i = 0; i < shows.length; i++) {
            if (data.containsKey(shows[i])) {
                data.put(shows[i], data.get(shows[i]) + durations[i]);
            } else {
                data.put(shows[i], durations[i]);
            }
        }
        ArrayList<Integer> durs = new ArrayList<>(data.values());
        Collections.sort(durs);
        System.out.println(durs);
        int sum = 0;
        for (int i = durs.size() - 1; i >= durs.size() - k; i--) {
            sum += durs.get(i);
        }
        return sum;
    }
}
