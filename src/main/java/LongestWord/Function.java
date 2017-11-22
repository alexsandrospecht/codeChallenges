package LongestWord;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Code Challenge
 * https://coderbyte.com/language/Longest%20Word
 * */
class Function {

    private static String retorno = "";

    public static String LongestWord(String sen) {
        final String[] strings = sen.replaceAll("[^a-zA-Z ]+", "").split(" ");

        Arrays.stream(strings).forEach(s -> {
            if (s.length() > retorno.length()) {
                retorno = s;
            }
        });

        return retorno;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}