package FirstFactorial;

import java.util.Scanner;

/**
 * Code Challenge
 * https://coderbyte.com/language/First%20Factorial
 * */
class Function {

    private int firstFactorial(int num) {
        if (num > 1) {
            return num * firstFactorial(num - 1);
        }

        return num;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(new Function().firstFactorial(Integer.parseInt(s.nextLine())));
    }

}