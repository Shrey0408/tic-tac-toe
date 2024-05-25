package org.shrey.tictactoe.models;

import org.shrey.tictactoe.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players;
    private int noOfPlayers;
    private Board board;
    private List<Move> moves;
    private int nextPlayerIndex;
    private Player winner;
    private GameState gameState;
    private List<WinningStrategy> winnningStrategies;

    public Game(List<Player> players, List<WinningStrategy> winningStrategies) {
        this.noOfPlayers = players.size();
        this.board = new Board(noOfPlayers+1);
        this.players = players;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = (int)(Math.random()*noOfPlayers);
        this.gameState = GameState.IN_PROGRESS;
        this.winnningStrategies = winningStrategies;
    }

    public void makeNextMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        Move move = players.get(nextPlayerIndex).makeMove(board);
        for(WinningStrategy ws: winnningStrategies){
           if(ws.checkWin(board, move)){
               System.out.println("Congrats," +currentPlayer.getName()+  " won!! :)");
               this.gameState = GameState.SUCCESS;
               winner = currentPlayer;
               return;
           }
        }
        if(Math.pow(board.getBoardSize(),2) == moves.size()){
            this.gameState = GameState.DRAW;
        }
        nextPlayerIndex = (nextPlayerIndex+1) % noOfPlayers;
    }

    public void displayBoard() {

        this.board.display();
    }

    public GameState getGameState() {
        return this.gameState;
    }
}
