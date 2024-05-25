package org.shrey.tictactoe.models;

public class Cell {
    Move move;
    CellState cellState = CellState.EMPTY;


    public Cell(){

    }
    public Cell(Move move, CellState cellState) {
        this.move = move;
        this.cellState = cellState;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
