package Tasks.BinarySearch;

public class CountingDinosaurs {
    public static void main(String[] args) {
        String a1 = "cdcjchvjjevcgjcdedgcchvrie";
        String a2 = "chbejhbcjnjjwdbxhejcehjcehcehx";
        String a3 = "ZZqBwgkqAIXoEmxGGJlvgQlEMktPgumTWsFzfXidNhkuFkhNMZwFQfcSHWZWYFflwfBowLLtEIngguwUnCilzUqAcdpdyfxWDzjbPFYSFPpBvxiZxSBZNYYkusCcWHC";

        String d1 = "c";
        String d2 = "cc";
        String d3 = "gmjYBiVKIBBziAxpwwMZmFlKuVTEOebxSHUIrRYRKtDmuwA";

        System.out.println(solve(a1, d1));
        System.out.println(solve(a2, d2));
        System.out.println(solve(a3, d3));
    }
    static int solve(String animals, String dinosaurs) {
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

    static String uni(String input) {
        String res = "";
        for (int i = 0; i < input.length(); i++) {
            if (!res.contains(String.valueOf(input.charAt(i)))) {
                res += String.valueOf(input.charAt(i));
            }
        }
        System.out.println("Unique dinos: " + res);
        return res;
    }
}
