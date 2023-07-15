public class AlphabetConverter {
    public static void main(String[] args) {
        String input = "india";
        String output = convertAlphabet(input);
        System.out.println(output);
    }

    public static String convertAlphabet(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char nextChar = (char) (currentChar + 1);
                output.append(nextChar);
            } else {
                output.append(currentChar);
            }
        }

        return output.toString();
    }
}
