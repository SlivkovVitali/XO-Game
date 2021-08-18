package io.game.XO;

import io.game.XO.model.Field;
import io.game.XO.model.Figure;
import io.game.XO.model.Game;
import io.game.XO.model.Player;
import io.game.XO.view.ConsoleView;

public class XOCLI {

    public static void main(final String[] args) {
        final String name1 = "Vitali";
        final String name2 = "Vikk";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while(consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }
    }

}
