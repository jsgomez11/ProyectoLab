/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoxo;

import java.util.Scanner;

/**
 *
 * @author recar
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        boolean turn = true;

        String player1 = "", player2 = ""; // Variables de nombre de jugador 
        char symbol1, symbol2; // Variables de simbolo
        int player1Vic = 0, player2Vic = 0, draws = 0;  // COntador Victorias 
        boolean victory = false; // Variable de ciclo 
        Scanner read = new Scanner(System.in); // scanner read

        //Variables del tablero 
        //  1 | 2 | 3
        // -----------
        //  4 | 5 | 6
        // -----------
        //  7 | 8 | 9
        int opcion = 0;

        do {
            System.out.println("\n\nLets Play Tic Tac Toe!");
            System.out.println("Instructions: You will be presented with the following board: "
                    + "\n 1 | 2 | 3"
                    + "\n-----------"
                    + "\n 4 | 5 | 6"
                    + "\n-----------"
                    + "\n 7 | 8 | 9"
                    + "\nOn the board are written its respective positions for you to"
                    + "\nindicate on which tile/position you want to have your mark on."
                    + "\nTo begin the game please select an option."
                    + "\n1. Play! "
                    + "\n2. Stadistics"
                    + "\n3. Exit Game.");
            System.out.print("Option: ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:

                    char pos1 = ' ';
                    char pos2 = ' ';
                    char pos3 = ' ';
                    char pos4 = ' ';
                    char pos5 = ' ';
                    char pos6 = ' ';
                    char pos7 = ' ';
                    char pos8 = ' ';
                    char pos9 = ' ';
                    int opcion1 = 0;
                    char symbol;

                    System.out.print("\nEnter Player 1 name: ");
                    player1 = read.next();
                    System.out.print("Enter Player 2 name: ");
                    player2 = read.next();

                    System.out.print("Enter the symbol " + player1 + " will use: ");
                    symbol1 = read.next().charAt(0);
                    System.out.print("Enter the symbol " + player2 + " will use: ");
                    symbol2 = read.next().charAt(0);
                    do {
                        boolean errored = false;
                        System.out.println("\n\n\n");
                        System.out.println(" " + pos1 + " | " + pos2 + " | " + pos3);
                        System.out.println("----------");
                        System.out.println(" " + pos4 + " | " + pos5 + " | " + pos6);
                        System.out.println("----------");
                        System.out.println(" " + pos7 + " | " + pos8 + " | " + pos9);

                        if (!turn) {
                            System.out.print(player2 + " on which position you would like to enter your symbol: ");
                            opcion1 = read.nextInt();
                            symbol = symbol2;
                        } else {
                            System.out.print(player1 + " on which position you would like to enter your symbol: ");
                            opcion1 = read.nextInt();
                            symbol = symbol1;
                        }

                        switch (opcion1) {
                            case 1:
                                if (pos1 != ' ') {
                                    errored = true;
                                    System.out.println("Position 1 occupied, try a different tile.");
                                    break;
                                }
                                pos1 = symbol;
                                break;
                            case 2:
                                if (pos2 != ' ') {
                                    errored = true;
                                    System.out.println("Position 2 occupied, try a different tile.");
                                    break;
                                }
                                pos2 = symbol;
                                break;
                            case 3:
                                if (pos3 != ' ') {
                                    errored = true;
                                    System.out.println("Position 3 occupied, try a different tile.");
                                    break;
                                }
                                pos3 = symbol;
                                break;
                            case 4:
                                if (pos4 != ' ') {
                                    errored = true;
                                    System.out.println("Position 4 occupied, try a different tile.");
                                    break;
                                }
                                pos4 = symbol;
                                break;
                            case 5:
                                if (pos5 != ' ') {
                                    errored = true;
                                    System.out.println("Position 5 occupied, try a different tile.");
                                    break;
                                }
                                pos5 = symbol;
                                break;
                            case 6:
                                if (pos6 != ' ') {
                                    errored = true;
                                    System.out.println("Position 6 occupied, try a different tile.");
                                    break;
                                }
                                pos6 = symbol;
                                break;
                            case 7:
                                if (pos7 != ' ') {
                                    errored = true;
                                    System.out.println("Position 7 occupied, try a different tile.");
                                    break;
                                }
                                pos7 = symbol;
                                break;
                            case 8:
                                if (pos8 != ' ') {
                                    errored = true;
                                    System.out.println("Position 8 occupied, try a different tile.");
                                    break;
                                }
                                pos8 = symbol;
                                break;
                            case 9:
                                if (pos9 != ' ') {
                                    errored = true;
                                    System.out.println("Position 9 occupied, try a different tile.");
                                    break;
                                }
                                pos9 = symbol;
                                break;
                        }

                        if (!errored) {
                            turn = !turn;
                        }

                        if (pos1 == symbol1 && pos2 == symbol1 && pos3 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos4 == symbol1 && pos5 == symbol1 && pos6 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos7 == symbol1 && pos8 == symbol1 && pos9 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos1 == symbol1 && pos4 == symbol1 && pos7 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos2 == symbol1 && pos5 == symbol1 && pos8 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos3 == symbol1 && pos6 == symbol1 && pos9 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos1 == symbol1 && pos5 == symbol1 && pos9 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos3 == symbol1 && pos5 == symbol1 && pos7 == symbol1) {
                            victory = true;
                            System.out.println(player1 + " wins!!");
                            player1Vic++;
                            break;
                        } else if (pos1 == symbol2 && pos2 == symbol2 && pos3 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos4 == symbol2 && pos5 == symbol2 && pos6 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos7 == symbol2 && pos8 == symbol2 && pos9 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos1 == symbol2 && pos4 == symbol2 && pos7 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos2 == symbol2 && pos5 == symbol2 && pos8 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos3 == symbol2 && pos6 == symbol2 && pos9 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos1 == symbol2 && pos5 == symbol2 && pos9 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos3 == symbol2 && pos5 == symbol2 && pos7 == symbol2) {
                            victory = true;
                            System.out.println(player2 + " wins!!");
                            player2Vic++;
                            break;
                        } else if (pos1 != ' ' && pos2 != ' ' && pos3 != ' ' && pos4 != ' ' && pos5 != ' ' && pos6 != ' ' && pos7 != ' ' && pos8 != ' ' && pos9 != ' ') {
                            System.out.println("ITS A DRAW! ");
                            draws++;
                            victory = true;
                            break;
                        }
                    } while (victory != true);
                    if (victory) {
                        System.out.println("\n");
                        System.out.println(" " + pos1 + " | " + pos2 + " | " + pos3);
                        System.out.println("----------");
                        System.out.println(" " + pos4 + " | " + pos5 + " | " + pos6);
                        System.out.println("----------");
                        System.out.println(" " + pos7 + " | " + pos8 + " | " + pos9);
                    }
                    break;
                case 2:
                    System.out.println("\n\nStadistics ");
                    System.out.println("Wins: ");
                    System.out.println("Player 1: " + player1Vic);
                    System.out.println("Player 2: " + player2Vic);
                    System.out.println("Draws: " + draws);
                    break;

            }
        } while (opcion != 3);
    }
}
