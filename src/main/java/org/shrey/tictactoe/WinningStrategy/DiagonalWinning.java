package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;

public class DiagonalWinning implements WinningStrategy{
    public DiagonalWinning() {
    }

    @Override
    public boolean checkWin(Board board, Move move) {
        return false;
    }
}
