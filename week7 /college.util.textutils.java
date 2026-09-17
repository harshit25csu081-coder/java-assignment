package college.util;

public class TextUtils {

    private static int counter = 0;

    private TextUtils() {
    }

    public static String normalizeName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return null;
        }
        name = name.trim();

        StringBuilder result = new StringBuilder();
       boolean space = false;

    for (int i = 0; i < name.length(); i++) {
           char ch = name.charAt(i);
            if (ch == ' ') {
                if (!space) {
                    result.append(ch);
                    space = true;
                }
            } else {
                result.append(ch);
                space = false;
            }
        }
        boolean first = true;

        for (int i = 0; i < result.length(); i++) {

            char ch = result.charAt(i);

            if (ch == ' ') {
                first = true;
            } else {
                if (first) {
                    result.setCharAt(i, Character.toUpperCase(ch));
                    first = false;
                } else {
          result.setCharAt(i, Character.toLowerCase(ch));
                }
            }
        }
        counter++;
        return result.toString();
    }
    public static int getCounter() {
        return counter;
    }
}