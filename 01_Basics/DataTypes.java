public class DataTypes {
    public static boolean isValidDataType(String s) {
        // can't be valid if it's empty
        if (s == null || s.length() == 0) return false;

        // first char must be a lowercase letter
        if (!Character.isLowerCase(s.charAt(0))) return false;

        // last char must be a digit
        if (!Character.isDigit(s.charAt(s.length() - 1))) return false;

        int underscoreCount = 0;
        int digitCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '_') {
                underscoreCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (!Character.isLowerCase(c)) {
                // invalid character found
                return false;
            }
        }

        // must have exactly one underscore and at least one digit
        return underscoreCount == 1 && digitCount >= 1;
    }
}
