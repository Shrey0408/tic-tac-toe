package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinning implements WinningStrategy{
    private Map<Character, Integer> mainDiagonal = new HashMap<>();
    private Map<Character, Integer> antiDiagonal = new HashMap<>();
    public DiagonalWinning() {
    }

    @Override
    public boolean checkWin(Board board, Move move) {
        int col = move.getCol();
        int row = move.getRow();
        Character c = move.getPlayer().getSymbol().getCharacter();
        int mainDiagonalCount = checkMainDiagonal(row, col, c);
        int antiDiagonalCount = checkAntiDiagonal(row, col, c, board.getBoardSize());
        return mainDiagonalCount == board.getBoardSize() || antiDiagonalCount == board.getBoardSize();
    }

    private int checkAntiDiagonal(int row, int col, Character c , int boardSize) {
        if(!antiDiagonal.containsKey(c)){
            antiDiagonal.put(c, 0);
        }
        if(row + col == boardSize-1){
            antiDiagonal.put(c, antiDiagonal.get(c)+1);
        }
        return antiDiagonal.get(c);
    }

    private int checkMainDiagonal(int row, int col, Character c) {
        if(!mainDiagonal.containsKey(c)){
            mainDiagonal.put(c, 0);
        }
        if(row == col){
            mainDiagonal.put(c, mainDiagonal.get(c)+1);
        }

        return mainDiagonal.get(c);
    }

}
