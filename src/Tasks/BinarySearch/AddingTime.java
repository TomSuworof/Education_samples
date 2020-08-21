package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Adding-time
 *
 * not solved (problems with tests)
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AddingTime {
    public static void main(String[] args) {
        String s0 = "5:30pm";
        int n0 = 90;

        String s1 = "11:30pm";
        int n1 = 30;

        String s2 = "12:14am";
        int n2 = 1414;

        String s3 = "12:29am";
        int n3 = 0;

        String s4 = "12:07pm";
        int n4 = 721;

        System.out.println(solve(s0, n0)); // 07:00pm
        System.out.println(solve(s1, n1)); // 12:00am
        System.out.println(solve(s2, n2)); // 11:48pm
        System.out.println(solve(s3, n3)); // 12:29am // wrong answer
        System.out.println(solve(s4, n4)); // 12:08am // wrong answer
    }

    private static String solve(String s, int n) {
        if (n == 0) return s;
        int hours = Integer.parseInt(s.split(":")[0]);
        int minutes = Integer.parseInt(s.substring(s.length() - 4, s.length() - 2));
        String indicator = s.substring(s.length() - 2);

        Calendar s_time = new GregorianCalendar();
        s_time.set(Calendar.HOUR, hours);
        s_time.set(Calendar.MINUTE, minutes);
        switch (indicator) {
            case "am":
                s_time.set(Calendar.AM_PM, Calendar.AM);
                break;
            case "pm":
                s_time.set(Calendar.AM_PM, Calendar.PM);
                break;
            default:
                break;
        }

        System.out.println(s_time.getTime());
        s_time.add(Calendar.MINUTE, n);
        System.out.println(s_time.getTime());

        String ans = new SimpleDateFormat("hh:mma").format(s_time.getTime()).toLowerCase();
        System.out.println(ans);

        return ans;
    }
}