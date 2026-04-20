public class PracticeProblem1 {
    public boolean isPalindrome(String s) {
        // clean the string — keep only letters and digits, all lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // use two pointers from both ends
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }

        return true; // made it through, it's a palindrome
    }
}
