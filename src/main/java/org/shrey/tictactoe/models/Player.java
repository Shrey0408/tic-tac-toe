package org.shrey.tictactoe.models;

import java.util.Scanner;

public class Player {
    String name;

    Symbol symbol;
    PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;

    }

    public Move makeMove(Board board) {
        Scanner scanner = ScannerSingleton.getScanner();
        System.out.println("Hello " +this.name+ ", Please enter row & column where you want to make your move");
        int row = scanner.nextInt();
        int col =scanner.nextInt();
        if(!board.validateMove(row, col)){
            makeMove(board);
        }else {
            Move m = new Move(row, col, this);
            board.updateMove(m);
            return m;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }


    public Symbol getSymbol() {
        return symbol;
    }

}
