public class StringBuilderToolkit {

    static String reverse(String text) {

        if (text == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);
        builder.reverse();

        return builder.toString();
    }

    static String repeat(String text, int count) {

        if (text == null) {
            return null;
        }

        if (count < 0) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(text);
        }

        return builder.toString();
    }

    static String joinWords(String[] words, String separator) {

        if (words == null || separator == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (i > 0) {
                builder.append(separator);
            }

            if (words[i] != null) {
                builder.append(words[i]);
            }
        }

        return builder.toString();
    }

    static String removeCharacterAt(String text, int index) {

        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);

        builder.deleteCharAt(index);

        return builder.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {

        if (text == null) {
            return null;
        }

        if (index < 0 || index >= text.length()) {
            return null;
        }

        StringBuilder builder = new StringBuilder(text);

        builder.setCharAt(index, replacement);

        return builder.toString();
    }

    static String buildNumberedList(String[] items) {

        if (items == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < items.length; i++) {

            builder.append(i + 1);
            builder.append(". ");

            if (items[i] != null) {
                builder.append(items[i]);
            }

            builder.append('\n');
        }

        return builder.toString();
    }
