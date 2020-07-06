package Tasks.BinarySearch;

public class CountingDinosaurs {
    public static void main(String[] args) {

    }
    public int solve(String animals, String dinosaurs) {
        String dino_unique = uni(dinosaurs);
        char[] dino_char = dino_unique.toCharArray();
        char[] ani_char = animals.toCharArray();
        int count = 0;
        for (int i = 0; i < dino_char.length; i++) {
            for (int j = 0; j < ani_char.length; j++) {
                if (dino_char[i] == ani_char[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public String uni(String input) {
        String res = String.valueOf(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) != input.charAt(j)) {
                    res += input.charAt(i);
                }
            }
        }
        return res;
    }
}
