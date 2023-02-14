package hangman;

import static hangman.playGame.playGame;
import java.util.Scanner;
import java.util.Random;

public class wordClass {
 public static Scanner input;
    
 public static void words(){
 input = new Scanner(System.in);    
    // Declaring an Array
  String[] words = {"BMW", "Mercedes", "Toyota", "Volkswagen", "Ferrari", "Hyundai"};
   
 System.out.println(" Welcome to HangMan (car level)");
 
 Random food = new Random();
  int any_num = food.nextInt(6);
    
   String input = (words[any_num]);
        input = input.toUpperCase();
    
     String word1 = input.replaceAll("[A-Z]", "_ ");
    
   System.out.println("The game will start now !");
        playGame(input, word1);
   
    }
   
    
}
