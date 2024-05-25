package org.shrey.tictactoe.models;

public enum CellState {
    FILLED("filled"),
    EMPTY("empty");

    final String value;

    private CellState(String value){
        this.value = value;
    }
}
