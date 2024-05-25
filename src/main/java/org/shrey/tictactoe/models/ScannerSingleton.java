package org.shrey.tictactoe.models;

import org.shrey.tictactoe.Controller.GameController;

import java.util.Scanner;

public class ScannerSingleton{
    private static Scanner scanner;
    private ScannerSingleton(){

    }
    public static Scanner getScanner(){
        if(scanner == null){
            synchronized (GameController.class){
                if(scanner == null){
                    return new Scanner(System.in);
                }
            }
        }
        return scanner;
    }
}
