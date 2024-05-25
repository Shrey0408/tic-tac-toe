package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;

import java.util.HashMap;

public class RowWinning implements WinningStrategy{

    HashMap<Integer, HashMap<Character,Integer>> rowCount = new HashMap<>();

    public RowWinning() {
    }

    @Override
    public boolean checkWin(Board board, Move move) {
        int row = move.getRow();
        Character c = move.getPlayer().getSymbol().getCharacter();
        if(!rowCount.containsKey(row)){
            rowCount.put(row, new HashMap<>());
        }

        HashMap<Character, Integer> charactersCount = rowCount.get(row);
        if(!charactersCount.containsKey(c)){
            charactersCount.put(c, 0);
        }
        charactersCount.put(c, charactersCount.get(c)+1);
        return charactersCount.get(c) == board.getBoardSize();
    }
}
