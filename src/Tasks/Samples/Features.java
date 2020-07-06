package Tasks.Samples;

import java.io.IOException;

class Features {
    public static void main(String[] args) {
        {
            int a = 1; // a = 1;
            int b = ++a; // a = 2, b = 2
            int c = a++; // a = 2, b = 2, c = 2
            // a = 3, b = 2, c = 2
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } // feature0();
        feature1();
        feature2();
        feature3();
        {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            int key = 6;
            int keyIndex = binarySearch(array, key);
            System.out.println("\n" + keyIndex);
        } // feature4();
        feature5();
    }

    public static void feature1 () {
        char a = '0';
        try {
            a = (char) System.in.read();
        } catch (IOException inputError) {
            System.err.println("Input error");
        } finally {
            System.out.println("You entered " + a);
        }
        System.out.println("The end");
    }

    public static void feature2 () {
        int i;
        boolean ans;
        for (i = 0, ans = true; i < 10; ++i, ans = !ans) {
            System.out.println("I repeat it " + i + " time. It is " + ans);
        }
    }

    public static void feature3 () {
        int x = 100, y = 200;
        while (++x < --y) {
            x += 0;
        }
        System.out.println("\n" + "Average: " + x);
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid;
            }
            else if (key > array[mid]) {
                low = mid;
            }
            else if (array[mid] == key) {
                return mid;
            }
        }
        return -1; // if it equal -1 then it was not found
    }

    public static void feature5 () {
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if( i == 3 && j == 5) {
                    break outer;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Was broken");
    }
}