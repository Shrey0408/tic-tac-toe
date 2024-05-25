package org.shrey.tictactoe.Controller;

import org.shrey.tictactoe.WinningStrategy.WinningStrategy;
import org.shrey.tictactoe.models.Game;
import org.shrey.tictactoe.models.Player;

import java.util.List;

public class GameController {

    private static GameController instance;

    private GameController(){

    }

    public static GameController getInstance(){
        if(instance == null){
            synchronized (GameController.class){
                if(instance == null){
                    return new GameController();
                }
            }
        }
        return instance;
    }

    public Game createGame(List<Player> players, List<WinningStrategy> winningStrategies){
        return new Game(players, winningStrategies);
    }

    public void makeNextMove(Game game){
        game.makeNextMove();
    }

    public void displayBoard(Game game)
    {
        game.displayBoard();
    }
}
