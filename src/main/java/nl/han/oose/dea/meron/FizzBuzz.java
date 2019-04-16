package nl.han.oose.dea.meron;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

        var main = new FizzBuzz();
        main.startFizzBuzz();
    }

    private void startFizzBuzz() {
        IntStream.range(0, 1000).forEach(pipo -> System.out.println(doFizzBuzz(pipo)));
    }

    public String doFizzBuzz(int number) {
        var returnValue = new StringBuilder();

        if (number % 3 == 0) {
            returnValue.append("Fizz");
        }
        if (number % 5 == 0) {
            returnValue.append("Buzz");
        }

        if (returnValue.length() == 0) {
            returnValue.append(number);
        }

        return returnValue.toString();
    }
}
