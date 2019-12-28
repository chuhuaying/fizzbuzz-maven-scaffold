public class FizzBuzz {
    public static String fizzBuzzGame(long x) {

        if (x <= 0){
            System.out.println("Please specify an integer greater than 0.\n");
            return "Oops";
        }

        if (( x % 3 == 0) && ( x % 5 == 0)) {
            return "FizzBuzz";
        }
        else if (x % 3 == 0) {
            return "Fizz";
        } else if (x % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(x);
        }
    }

    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            System.out.println(fizzBuzzGame(x));
        }

    }
}

