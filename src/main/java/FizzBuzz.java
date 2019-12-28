/**
 * class FizzBuzz
 * Author: chuhuaying
 * Date: 2019-12-28
 */
public class FizzBuzz {
    public static String fizzBuzzGame(long x, long fizzNumber, long buzzNumber, long whizzNumber) {
        String returnValue = "";
        if (x <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if ((x % fizzNumber == 0) && (x % buzzNumber == 0) && (x % whizzNumber == 0)) {
            returnValue = "FizzBuzzWhizz";
        } else if ((x % fizzNumber == 0) && (x % buzzNumber == 0)) {
            returnValue = "FizzBuzz";
        } else if ((x % fizzNumber == 0) && (x % whizzNumber == 0)) {
            returnValue = "FizzWhizz";
        } else if ((x % buzzNumber == 0) && (x % whizzNumber == 0)) {
            returnValue = "BuzzWhizz";
        } else if (x % fizzNumber == 0) {
            returnValue = "Fizz";
        } else if (x % buzzNumber == 0) {
            returnValue = "Buzz";
        } else if (x % whizzNumber == 0) {
            returnValue = "Whizz";
        } else {
            returnValue = String.valueOf(x);
        }
        return returnValue;
    }
    /*
     * main class
     */
    public static void main(String[] args) {
        /**
         * loop 100 times and print the result
         */
        for (int x = 1; x <= 100; x++) {
            System.out.println(fizzBuzzGame(x, 3, 5,7));
        }

    }
}

