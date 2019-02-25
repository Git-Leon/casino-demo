package rocks.zipcode.io.games;

import rocks.zipcode.io.Console;

public class CrapsGame implements GameInterface {
    public void play() {
        System.out.println("Welcome to my craps game!");
        Console console = new Console(System.in, System.out);
        Integer val1 = console.getIntegerInput("What is the value of the first integer to add?");
        Integer val2 = console.getIntegerInput("What is the value of the second integer to add?");
        console.println("The sum of the values is " + (val1 + val2));

    }
}
