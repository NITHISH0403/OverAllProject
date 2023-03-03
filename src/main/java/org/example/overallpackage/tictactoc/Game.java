package org.example.overallpackage.tictactoc;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.*;
class Game{
    protected int search;
    protected int flag = 0;
    protected static Scanner s = new Scanner(System.in);
    protected static Logger l = Logger.getLogger("com.api.jar");
    PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
    protected int play = 0;
    protected String player1 = "Player 1 is Winner.";
    protected String player2 = "Player 2 is Winner.";
    protected String draw = "The Match is Draw.";

    //find the Player do play
    protected void players(String[][] a){
        do{
            //Player 1
                if (play != 16) {
                    if (play % 2 == 0) {
                        p.println("Choose the place in Player 1 -> X:");
                        search = s.nextInt();

                        player(a, "X");

                        display(a);

                        condition(a, player1);
                    }
                    //player 2
                    else {
                        p.println("Choose the place in Player 2 -> O:");
                        search = s.nextInt();

                        player(a, "O");

                        display(a);

                        condition(a, player2);
                    }
                } else {
                    p.println(draw);
                    flag++;
                }
            }while (flag==0);
    }

    //player choose is replace our Symbol
    void player(String[][] a, String option){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((a[i][j].equals(String.valueOf(search)))) {
                    if (!a[i][j].equals("X") || !a[i][j].equals("O")) {
                        a[i][j] = option;
                        play++;
                    }
                    else {
                        p.println("Please, Choose another place.");
                    }
                }
            }
        }
    }
    //check the condition
    void condition(String[][] a, String x)
    {
        for(int i = 0; i<4; i++){
            //hor
            if(a[i][0].equals(a[i][1]) && a[i][1].equals(a[i][2]) && a[i][2].equals(a[i][3]) && a[i][3].equals(a[i][0])){
                declare(x);

            }
            //ver
            else if(a[0][i].equals(a[1][i]) && a[1][i].equals(a[2][i]) && a[2][i].equals(a[3][i]) && a[3][i].equals(a[0][i])){
                declare(x);
            }
            //left to right cross
            else if (a[0][0].equals(a[1][1]) && a[1][1].equals(a[2][2]) && a[2][2].equals(a[3][3])) {
                declare(x);
            }
            //right to left cross
            else if (a[0][3].equals(a[1][2]) && a[1][2].equals(a[2][1]) && a[2][1].equals(a[3][0])) {
                declare(x);
            }
        }
    }
    void declare(String x){
        if(flag==0) {
            winner(x);
            flag++;
        }
    }
    //announce the final winner
    void winner(String x){
        p.println(x);
    }
    //display the current board
    void display(String[][] a){
        for (int i = 0; i < 4; i++) {
            p.print("|");
            for (int j = 0; j < 4; j++) {
                String n = String.valueOf(a[i][j]);
                p.print("\t" + n + "\t" + "|");
            }
            p.println("\n");
        }
    }
}
