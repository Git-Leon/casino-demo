package rocks.zipcode.io;

import rocks.zipcode.io.games.GameInterface;

import java.util.Arrays;

public class Casino {
    private static final Console console = new Console(System.in, System.out);
    public static void main(String[] args) {
        String continueString  = null;
        while(!"quit".equals(continueString)) {
            console.println("Welcome to my casino!");
            console.println("From here, you can select any of the following games");
            String userInput = console.getStringInput(Arrays.toString(GameEnum.values()));
            GameEnum enumeration = GameEnum.getValueOf(userInput);
            GameInterface gameInterface = enumeration.create();
            gameInterface.play();
            continueString = console.getStringInput("Would you like to continue?");
        }
    }
}
