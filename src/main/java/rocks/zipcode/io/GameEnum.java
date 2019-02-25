package rocks.zipcode.io;

import rocks.zipcode.io.games.BlackJackGame;
import rocks.zipcode.io.games.CrapsGame;
import rocks.zipcode.io.games.GameInterface;
import rocks.zipcode.io.games.GoFishGame;

import java.util.function.Supplier;

public enum GameEnum {
    BLACKJACK(BlackJackGame::new),
    CRAPS(CrapsGame::new),
    GOFISH(GoFishGame::new);

    private final Supplier<GameInterface> supplier;

    GameEnum(Supplier<GameInterface> supplier) {
        this.supplier = supplier;
    }

    public GameInterface create() {
        return supplier.get();
    }

    public static GameEnum getValueOf(String userInput) {
        userInput = userInput.toUpperCase();
        try {
            return valueOf(userInput);
        } catch (IllegalArgumentException iae) {
            return valueOf(userInput.replaceAll(" ", "_"));
        }
    }
}
