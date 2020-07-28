package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Space-Battle
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SpaceBattle {
    public static void main(String[] args) {
        int[] rockets0 = {1, -2};
        int[] rockets1 = {1, 5, 3, -6};
        int[] rockets2 = {1, 5, 3, -6, 7};
        int[] rockets3 = {36, -3, -94};
        int[] rockets4 = {2222, 2222, -12, 25, 25, 3};
        int[] rockets5 = {12, -28, -28, 3};
        int[] rockets6 = {-21, -98, 259, -998, -494, -603, -312, -429, 292, -962,
                566, 424, 448, -202, -720, 863, -226, -327, 667, -811, 479, -865,
                -684, -390, -62, -849, -541, 454, 437, -244, 429, 380, -390, 423,
                -837, 463, 258, -911, 207, 620, 911, -312, -663, -751, -327, -193,
                -911, 483, -534, -663, 787, -389, -516, 738, -571, -565, -582, -533,
                696, -444, 496, 847, 535, -107, 978, 97, 517, -679, 993, 329, 157,
                23, 532, 963, -342, -514, 186, 823, 939, -716, -788, -219, 433, -27,
                -458, -205, 246, 886, 801, 643, 506, 221, -958, -136, 391, -926, 565,
                -682, 794, 861, 51, 694, -197, -635, 616, 84, -343, -373, -797, 890,
                903, -65, -174, 784, 373, -236, -17, -667, -841, -668, -567, -838,
                126, -88, -634, -110, 483, 909, 237, 22, -910, 925, 164, -34, 315,
                571, -116, -870, -7, 778, 912, -435, 495, 820, -848, -77, 996, -189,
                77, -545, 727, 28, 289, 125, 763, 992, 952, 768, -79, 912, 901, -423, 883};

        print(rockets0); // [-2]
        print(rockets1); // [-6]
        print(rockets2); // [-6, 7]
        print(rockets3); // [-94]
        print(rockets4); // [2222, 2222, 25, 25, 3]
        print(rockets5); // [-28, -28, 3]
        print(rockets6); /*
        [-21, -98, -998, -494, -603, -312, -429, -962, -720, -865, -684, -390, -62,
        -849, -541, -837, -911, -663, 787, 738, 696, 496, 847, 535, 978, 993, 329,
        157, 23, 532, 963, 925, 778, 912, 996, 727, 28, 289, 125, 763, 992, 952,
        768, 912, 901, 883]
        */
    }
    private static int[] solve(int[] nums) {
        ArrayList<Integer> rockets = new ArrayList<>();

        for (int num : nums) {
            rockets.add(num);
        }

        boolean wasCollapse;

        do {
            wasCollapse = false;
            for (int i = 0; i < rockets.size(); i++) {
                if (i != rockets.size() - 1 && rockets.get(i).intValue() ==  rockets.get(i + 1).intValue()) {
                    continue;
                }
                if (i != rockets.size() - 1 && rockets.get(i) > 0 && rockets.get(i + 1) < 0) {
                    if (rockets.get(i) + rockets.get(i + 1) == 0) {
                        rockets.remove(i + 1);
                        rockets.remove(i);
                    } else {
                        rockets.remove(rockets.get(i) + rockets.get(i + 1) > 0 ? i + 1 : i);
                    }
                    wasCollapse = true;
                    break;
                }
            }
        } while (wasCollapse);

        int[] ans = new int[rockets.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = rockets.get(i);
        }
        return ans;
    }
    private static void print(int[] array) {
        System.out.println(Arrays.toString(solve(array)));
    }
}
