package week10;

import java.util.Scanner;

/**
 *
 * @author Jaspreet singh
 */
public class Week10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number os 0.*/
     //program starts
     /*
        Scanner input= new Scanner(System.in);
        // make an array to hold 10 numbers
        int[]n=new int[10];
        //declare some variables
        int pos=0;
        int neg=0;
        int odd=0;
        int even=0;
        int zeros=0;
            
        
        
        //create loop to get the user input
        for(int i=0;i<n.length;i++){
            System.out.print("Please input a number");
            //store number into array
            n[i]=input.nextInt();
        }
        //classify each number
        for(int i=0;i<n.length;i++){
           //check if pos/neg/or zero
           //use an if, else if, else
           if(n[i]>0){
             pos++; 
           }
           else if(n[i]<0){
              neg++; 
           }
           else{
            zeros++;
        }
           //check if even or odd
           if(n[i]%2==0){
               even++;
               
           }
           else{
               odd++;
               }
        }
        //output the result
        System.out.printf("There are %d positive numbers\n", pos);
        System.out.printf("There are %d negative numbers\n", neg);
        System.out.printf("There are %d even numbers\n", even);
        System.out.printf("There are %d odd numbers\n", odd);
        System.out.printf("There are %d zeros", zeros);
        */
        // TIC TAC TOE
        
        Scanner input = new Scanner(System.in);

        // let's build an array that's 3 by 3
        char[][] board = new char[3][3];
        //variable for user input
        int userRow;
        int userCol;
        
        int player = 1;
        int count = 0;
        //let's initialize the arrray to dashed
        for (int i = 0; i < board.length; i++) {//horizontal length
            for (int j = 0; j < board[i].length; j++) {//vertical length..........significance of [i]????
                board[i][j] = '-';
            }
        }
        printBoard(board);
        //start loop
        while (count < 9) {

            //Alternate between two players getting the location
            System.out.print("Player " + player + "  please input your row:");
            userRow = input.nextInt()-1;
            System.out.print("Player " + player + " please input your column:");
            userCol = input.nextInt()-1;
           //change the board to an X if player 1 O if player 2
            if (player == 1) {
                board[userRow][userCol] = 'X';
                printBoard(board);
                count++;
                player =2;
            }else if(player ==2){
                board[userRow][userCol] = 'O';
                printBoard(board);
                 count++;
                player =1;
            }
            
        }
    }//end of main

    public static void printBoard(char[][] board) {

        //print the board 
        for (int i = 0; i < board.length; i++) {//horizontal length
            for (int j = 0; j < board[i].length; j++) {//vertical length
                System.out.print(board[i][j] + " ");
            }
            System.out.println();//new line after every three dashes
        }

    }//end of printboard method
         
    }
    
    

