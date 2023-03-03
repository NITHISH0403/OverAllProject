package org.example.overallpackage.tictactoc;

public class Tictactoc extends Game {
    String[][] a = new String[10][10];
    int value = 1;
   public Tictactoc(){
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               a[i][j] = String.valueOf(value++);
           }
       }
    }
    public void print(){
        display(a);
        players(a);
    }
}