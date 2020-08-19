package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Sort-by-frequency-and-value
 */


import java.util.*;
import java.util.stream.Collectors;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] nums0 = {1, 1, 5, 5, 5, 2, 2, 2, 1, 1};
        int[] nums1 = {1, 11, 11, 0, 6, 3, 6, 5, 10, 7, 3};

        System.out.println(Arrays.toString(solve(nums0))); // [1, 1, 1, 1, 5, 5, 5, 2, 2, 2]
        System.out.println(Arrays.toString(solve(nums1))); // [11, 11, 6, 6, 3, 3, 10, 7, 5, 1, 0]
    }

    private static int[] solve(int[] nums) {
        Map<Integer, Integer> valFreq = new HashMap<>();
        for (int num : nums) {
            if (!valFreq.containsKey(num)) {
                valFreq.put(num , 1);
            } else {
                valFreq.put(num, valFreq.get(num) + 1);
            }
        }

        ValFreqComparator valFreqComparator = new ValFreqComparator();

        valFreq = valFreq.entrySet().stream()
                .sorted(valFreqComparator)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<Integer, Integer> entry : valFreq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : valFreq.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                ans.add(entry.getKey());
            }
        }
        for (int i = 0; i < ans.size(); i++) nums[i] = ans.get(i);
        return nums;
    }
}

class ValFreqComparator implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if (o1.getValue() > o2.getValue()) {
            return -1;
        } else if (o1.getValue() < o2.getValue()) {
            return 1;
        } else if (o1.getValue() == o2.getValue()) {
            if (o1.getKey() > o2.getKey()) {
                return -1;
            } else if (o1.getKey() < o2.getKey()) {
                return 1;
            }
        }
        return 0;
    }
}