/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Scanner;
import static week10.Week10.printBoard;

/**
 *
 * @author user
 */
public class practice {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("********Tick Tack Toe********");
        char[][] board=new char[3][3];
    int userRow,userColumn;
    int player =1;
          int count=0;
           for(int a=0;a<board.length;a++){
               for(int b=0;b<board[a].length;b++){
                 board[a][b]='-';  
              }
          }
         printBoard(board);
      while(count<9){
          System.out.println("Player "+player+" enter your row");
          userRow=input.nextInt()-1;
           System.out.println("Player "+player+" enter your column");
           userColumn=input.nextInt()-1;
           if(player==1){
               board[userRow][userColumn]='X';
               count++;
               player=2;
             printBoard(board); 
             winner(board);
                            
           }
           else{
               board[userRow][userColumn]='O';
               count++;
              player=1;
              printBoard(board);
              winner(board);
           }
      }
         
    } 
    
    public static void winner(char[][] board){
  //*******GOING FROM RIGHT TO LEFT FOR PLAYER 1 IN ALL THREE ROWS
                if(board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                else if(board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                else if(board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                
                //*******GOING FROM top TO bottom FOR PLAYER 1 IN ALL THREE columns
                else if(board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                else if(board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                else if(board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                
                
                //Doing diagonals for palyer 1
                else if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                else if(board[2][0]=='X' && board[1][1]=='X' && board[0][2]=='X'){
                    System.out.println("Player 1 Wins");
                        System.exit(0);
                }
                
                
                
                
                
                //************************************************************
               // now repeating above steos fro player 2
               
               
               
               
               else if(board[0][0]=='O' && board[0][1]=='O'&& board[0][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                else if(board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                else if(board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                
                //*******GOING FROM top TO bottom FOR PLAYER 1 IN ALL THREE columns
                else if(board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                else if(board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                else if(board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                
                
                //Doing diagonals for palyer 1
                else if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
                else if(board[2][0]=='O' && board[1][1]=='O' && board[0][2]=='O'){
                    System.out.println("Player 2 Wins");
                        System.exit(0);
                }
            
    }
}
