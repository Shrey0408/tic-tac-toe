package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;
import org.shrey.tictactoe.models.Symbol;

import java.util.HashMap;

public class ColumnWinning implements WinningStrategy{

    HashMap<Integer, HashMap<Character,Integer>> colCount = new HashMap<>();

    public ColumnWinning() {
    }

    @Override
    public boolean checkWin(Board board, Move move) {
        int col = move.getCol();
        Character c = move.getPlayer().getSymbol().getCharacter();
        if(!colCount.containsKey(col)){
            colCount.put(col, new HashMap<>());
        }

        HashMap<Character, Integer> charactersCount = colCount.get(col);
        if(!charactersCount.containsKey(c)){
            charactersCount.put(c, 0);
        }
        charactersCount.put(c, charactersCount.get(c)+1);
        return charactersCount.get(c) == board.getBoardSize();
    }
}
