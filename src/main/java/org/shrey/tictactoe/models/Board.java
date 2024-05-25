package org.shrey.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> grid;
    int boardSize;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        grid = new ArrayList<>();
        for(int i =0 ;i<boardSize; i++){
            grid.add(new ArrayList<Cell>());
            for(int j =0; j< boardSize; j++){
                grid.get(i).add(new Cell());
            }
        }
    }

    public int getBoardSize(){
        return this.boardSize;
    }

    public boolean validateMove(int row, int col) {
        if (row <0 || row>= boardSize || col<0 || col>= boardSize ||getCell(row,col).getCellState().equals(CellState.FILLED) )
        {
            System.out.println("Illegal move. Please try again");
            return false;
        }
        return true;
    }

    public void updateMove(Move m) {
        Cell cellToUpdate = getCell(m.getRow(),m.getCol());
        cellToUpdate.setCellState(CellState.FILLED);
        cellToUpdate.setMove(m);

    }

    public void display() {
        for(int i =0; i< boardSize; i++){
            for (int j=0;j< boardSize; j++){
                Cell currentCell = getCell(i,j);
                if(currentCell.getCellState().equals(CellState.FILLED)){
                    System.out.print("|"+currentCell.getMove().getPlayer().getSymbol().getCharacter()+"|");
                }else {
                    System.out.print("|-|");
                }
            }
            System.out.println();
        }
    }

    private Cell getCell(int row, int col){
        return this.grid.get(row).get(col);
    }
}
