package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Vanity-Phone-Numbers
 *
 * not solved
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class VanityPhoneNumber {
    public static void main(String[] args) {
        /*
        mapping:

        | 2 | abc  |
        | 3 | def  |
        | 4 | ghi  |
        | 5 | jkl  |
        | 6 | mno  |
        | 7 | pqrs |
        | 8 | tuv  |
        | 9 | wxyz |

         */

        String digits = "23";

        print(digits); // ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    }

    static String[] solve(String digits) {
        HashMap<Integer, String> d = new HashMap<>(); // d means dictionary
        d.put(2, "abc");
        d.put(3, "def");
        d.put(4, "ghi");
        d.put(5, "jkl");
        d.put(6, "mno");
        d.put(7, "pqrs");
        d.put(8, "tuv");
        d.put(9, "wxyz");
        // there should be an algorithm of Cartesian Product

//        ls=list(d.get(digits[0]))
//        temp=[]
//        for i in range(1,len(digits)):
//          temp=sorted(ls*len(d.get(digits[i])))
//          c2=0
//          while(c2!=len(temp)):
//              for j in range(len(d.get(digits[i]))):
//                  c1=0
//                  while(c1!=len(d.get(digits[i]))):
//                      if c2==len(temp):
//                          break
//                      temp[c2]+=d.get(digits[i])[c1]
//                      c1+=1
//                      c2+=1
//          ls=temp
//        return ls

        return null;
    }

    static void print(String digits) {
        System.out.println(Arrays.toString(solve(digits)));
    }

//    static String[] solve(String digits) {
//        if (digits.length() == 0) {
//            return null;
//        }
//
//        // calculate the number of all possible combinations
//        int resSize = 1;
//        for (char dig : digits.toCharArray()) {
//            resSize *= dig2lets[dig - '0'].length();
//        }
//        res = new String[resSize];
//
//        // generate all possible combinations
//        GetDPTexts(digits, 0);
//        return res;
//    }
//
//    static String[] dig2lets = new String[] {
//            null,
//            null,
//            "abc",  // 2
//            "def",  // 3
//            "ghi",  // 4
//            "jkl",  // 5
//            "mno",  // 6
//            "pqrs", // 7
//            "tuv",  // 8
//            "wxyz"  // 9
//    };
//    static int resIdx = 0;
//    static StringBuilder sb = new StringBuilder();
//    static String[] res;
//
//    static void GetDPTexts(String digits, int curDigIdx) {
//        if (curDigIdx == digits.length() - 1) {
//            res[resIdx++] = sb.toString();
//        } else {
//            for (char letter : dig2lets[Integer.parseInt(String.valueOf(digits.charAt(curDigIdx) - '0'))].toCharArray()) {
//                sb.append(letter);
//                GetDPTexts(digits, curDigIdx + 1);
//                sb = new StringBuilder(sb.toString().substring(0, sb.toString().length() - 1));
//            }
//        }
//    }
}
