package Tasks;

import java.lang.ref.*;
// import java.lang.reflect.*;

public class Numbers {
    public static void main(String[] args) {
        SomeNumber original = new SomeNumber(65536);
        original.print();
        SomeNumber duplicate = new SomeNumber(65536);
        duplicate.print();
        System.out.println(original.equals(duplicate));

//        SomeNumber[] array = {original, duplicate};

        System.out.println(new SoftReference<>(original));
        System.out.println(new SoftReference<>(duplicate));
        System.out.println(original.hashCode());
        System.out.println(duplicate.hashCode());

/*        Class someClass = original.getClass();
        Method someMethod = someClass.getMethod("print()");
        System.out.println(someClass + " " + someMethod);*/
    }
}

class SomeNumber {
    private final int x;

    SomeNumber (int x) {
        this.x = x;
    }

    void print() {
        System.out.println(x);
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof SomeNumber) {
            return this.x == ((SomeNumber)o).x;
        }
        return false;
    }
}