public class Variables {
    public static int maxInstances(String text) {
        // count how many times each letter appears in text
        int[] charCount = new int[26];
        for (char c : text.toCharArray()) {
            charCount[c - 'a']++;
        }

        // count letters needed in the word "variables"
        int[] needed = new int[26];
        for (char c : "variables".toCharArray()) {
            needed[c - 'a']++;
        }

        // see how many complete copies we can make
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (needed[i] > 0) {
                result = Math.min(result, charCount[i] / needed[i]);
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
