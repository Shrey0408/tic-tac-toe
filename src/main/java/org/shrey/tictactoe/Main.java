package org.shrey.tictactoe;

import org.shrey.tictactoe.Controller.GameController;
import org.shrey.tictactoe.WinningStrategy.ColumnWinning;
import org.shrey.tictactoe.WinningStrategy.DiagonalWinning;
import org.shrey.tictactoe.WinningStrategy.RowWinning;
import org.shrey.tictactoe.WinningStrategy.WinningStrategy;
import org.shrey.tictactoe.models.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static GameController gameController;
    public static void main(String[] args) {
       //0. Get all the details for Game
        Player p1 = new Player("Mohit", new Symbol('X'), PlayerType.HUMAN);
        Player p2 = new Player("Rohit", new Symbol('O'), PlayerType.HUMAN);

        List<WinningStrategy> winnningStartegies= List.of(new DiagonalWinning(), new RowWinning(), new ColumnWinning());
        //1. Start a game
        gameController = GameController.getInstance();
        Game game = gameController.createGame(List.of(p1,p2), winnningStartegies);
        //2.1.        Ask Player to move if Human, if bot will make move. Until game state is IN_PROGRESS
        gameController.displayBoard(game);
        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.makeNextMove(game);
            gameController.displayBoard(game);
        }
       //2.2         Check winner
       //2.3         Display board
       //4. Finish Game with draw if all filled and no winner announed.
    }
}