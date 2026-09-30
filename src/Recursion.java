public class Recursion extends ArrayTools{

    // Attribute to count the number of recursive calls
    public static int callCount = 0;


    public long power(int base, int exp) {
        callCount++;
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public int sum(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        }
        return a[i] + sum(a, i + 1);
    }

    public static int countChar(String s, char c) {
        if (s.isEmpty()) {
            return 0;
        }
        // Check if the first character matches the char
        int match = (s.charAt(0) == c) ? 1 : 0;
        return match + countChar(s.substring(1), c);
    }

    public long powerIterative(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }

}