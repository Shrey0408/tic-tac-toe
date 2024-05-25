package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;

public class RowWinning implements WinningStrategy{
    public RowWinning() {
    }

    @Override
    public boolean checkWin(Board board, Move move) {
        return false;
    }
}
