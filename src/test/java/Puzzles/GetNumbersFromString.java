package Puzzles;

public class GetNumbersFromString {



    // Get extract numbers from String
    public static String getAllNumberfromString(String input) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Get only Numbers from String
    public static String getExtractDigits(String src) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public static void main(String[] arg) {

        String input = "Total 128 jobs Found 25";
        String str = "abc d 1234567890pqr 54897";

        // Get only Numbers from Alphanumeric String using methods
        System.out.println(getAllNumberfromString(input));
        System.out.println(getAllNumberfromString(input));
        System.out.println(getExtractDigits(str));
        System.out.println(getExtractDigits(str));

        // Get extract numbers from String using Regular Expressions
        System.out.println(input.replaceAll("[^0-9]", ""));
        System.out.println(str.replaceAll("\\D+", ""));



        // Get extract numbers separately from String using Regular Expressions
        System.out.println(input.replaceAll("[^-?0-9]+", " "));


    }
}
