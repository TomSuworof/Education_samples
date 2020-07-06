package Tasks.Samples;

public class Generics {
    public static void main(String[] args) {
        GenClass<String> genClass = new GenClass<>("hello");
        System.out.println(genClass.getInput());
        genClass.getType();

        Pair<String, Integer> pair = new Pair<>("world", 1);
        System.out.println(pair.getKey() + " : " + pair.getValue());
        pair.getTypes();

        Integer[] someArray = {4, 6, 2, 74, 0};
        Double[] anotherArray = {4.0, 6.0, 2.0, 74.0, 0.0};
        Float[] yetArray = {4.4F, 2.5F, 64.0F, 4.3F, 7.4F};

        MathStat<Integer> mathStat = new MathStat<>(someArray);
        MathStat<Double> anotherArrayStat = new MathStat<>(anotherArray);
        MathStat<Float> yetArrayStat = new MathStat<>(yetArray);

        System.out.println("Averages: " + mathStat.getAverage() + " | " + anotherArrayStat.getAverage() + " | " + yetArrayStat.getAverage());
        System.out.println("Medians: " + mathStat.getMedian() + " | " + anotherArrayStat.getAverage() + " | " + yetArrayStat.getMedian());

        System.out.println(mathStat.equalsArray(anotherArray));
        System.out.println(mathStat.equalsArray(yetArray));

        MathStat<Integer> strangeStat = new MathStat<>(new Integer[] {5, 3, 7, 1, 9});
        System.out.println("Average of strange array: " + strangeStat.getAverage());
        System.out.println("Median of strange array: " + strangeStat.getMedian());
    }
}

class GenClass<T> {
    private final T input;

    GenClass(T input) {
        this.input = input;
    }

    T getInput() {
        return input;
    }

    void getType() {
        System.out.println("The type was " + input.getClass().getName());
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void getTypes() {
        System.out.println("Key is " + key.getClass().getName());
        System.out.println("Value is " + value.getClass().getName());
    }
}

class MathStat<T extends Number> {
    private final T[] arrayData;

    MathStat(T[] arrayData) {
        this.arrayData = arrayData;
    }

    double getAverage() {
        double sum = 0.0;
        for (T number : arrayData) {
            sum += number.doubleValue();
        }
        return sum / arrayData.length;
    }

    double getMedian() {
        double max = arrayData[0].doubleValue();
        double min = arrayData[0].doubleValue();
        for (T currentNumber : arrayData) {
            max = Math.max(max, currentNumber.doubleValue());
            min = Math.min(min, currentNumber.doubleValue());
        }
        return (max + min) / 2;
    }

    <E extends Number> boolean equalsArray(E[] anotherArray) {
        if (arrayData.length != anotherArray.length) {
            return false;
        }
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i].doubleValue() != anotherArray[i].doubleValue()) {
                return false;
            }
        }
        return true;
    } // compare MathStat with any number array
}