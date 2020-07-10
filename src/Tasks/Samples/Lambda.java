package Tasks.Samples;

public class Lambda {
    public static void main(String[] args) {
        MyNumber myNum = () -> 123.456; // created an object with specified function
        System.out.println(myNum.getValue()); // 123.456

        NumericTricks.CompareTwoNumbers max = Math::max;// method reference, same as (a, b) -> (Math.max(a, b))
        System.out.println(max.compare(12, 63)); // 63.0

        NumericTricks.NumericTest isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(74657465) + " " + isEven.test(646634)); // false true

        NumericTricks.NumericTest isPrime = n -> {
            if (n == 0 || n == 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.test(11) + " " + isPrime.test(12)); // true false

        NumericTricks fact = n -> {
            double res = 1;
            for (int i = 2; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println(fact.make(6)); // 720.0
    }
}

interface MyNumber {
    double getValue();
} // functional interface



interface NumericTricks {
    double make(double n);

    interface NumericTest {
        boolean test(int n);
    }

    interface CompareTwoNumbers {
        double compare(double a, double b);
    }
} // also functional interface