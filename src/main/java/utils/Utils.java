package utils;

public class Utils {

    @Generated
    private Utils() {
        throw new IllegalStateException("Utility Class");
    }

    public static String leftTrim(String string) {
        int pointer = 0;
        while (pointer < string.length() && Character.isWhitespace(string.charAt(pointer))) {
            pointer++;
        }

        return string.substring(pointer);
    }

    public static String rightTrim(String string) {
        int pointer = string.length() - 1;
        while (pointer >= 0 && Character.isWhitespace(string.charAt(pointer))) {
            pointer --;
        }
        return string.substring(0, pointer + 1);
    }

}
