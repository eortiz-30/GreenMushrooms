/*
GreenMushrooms: Emily Ortiz, Tasnim Chowdhury, Kartik Vanjani
APCS PD8
FP: Show Us What You Got
2022-01-20
Time Spent: 5.5 Hours
*/

import java.util.Scanner;

public class Woo {

  static Scanner in = new Scanner (System.in);
  static int gameCtr = 0;

  public Woo() {
    String player = "";
    int gameNum = 0;
  }

  public static void Welcome() { //-Tasnim
    System.out.println("\n----------------------------------------------------");
    System.out.println("\nWelcome to Bingo!");
    System.out.println("Made by: Tasnim Chowdhury, Kartik Vanjani, and Emily Ortiz\n\n");
    System.out.print("What is your name? ");
    String player = in.nextLine();
    if (player.equals("Mr. Mykolyk")) {
      System.out.println();
      System.out.println("OMG, we love your class. You are the best APCS teacher!");
      System.out.println("");
    }
    System.out.println("Hi there, " + player + "! Press enter to get started:");
  }

  public static void start() { //-Tasnim
    String statement = in.nextLine();
    while (!statement.equals("No")){
      System.out.print("Type 0 for Regular Bingo. Type 1 for Biased Bingo. ");
      String gameType = in.nextLine();
      String type = "";
      try {
        if (gameType.equals("0")) {
           type = "regBingo";
        }
        if (gameType.equals("1")) {
           type = "biasBingo";
        }
      }
      catch (Exception e) {
        System.out.println("Please type a valid input!");
      }
      play(type);
      gameCtr++;
      System.out.print("Would you like to play again? Type 'No' to stop or press any key to continue: ");
      statement = in.nextLine();
    }
  }

  public static void play(String type) { //-Tasnim
    if (type.equals("regBingo")) {
      BingoGame game = new BingoGame("regBingo");
    }
    if (type.equals("biasBingo")) {
      BingoGame game = new BingoGame("biasBingo");
    }
  }

  public static void main( String[] args ) {
    Welcome();
    start();
    System.out.println("\nThanks for playing "+ gameCtr + " game(s)!");

  } //end main

} //end Woo
