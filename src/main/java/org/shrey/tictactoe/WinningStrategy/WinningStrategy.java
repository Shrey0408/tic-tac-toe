package org.shrey.tictactoe.WinningStrategy;

import org.shrey.tictactoe.models.Board;
import org.shrey.tictactoe.models.Move;

public interface WinningStrategy {
    public boolean checkWin(Board board, Move move);
}
