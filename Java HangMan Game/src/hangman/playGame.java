package hangman;
// import statements
import java.util.Scanner;

public class playGame {
   
   public static Scanner input;
   
    public static void playGame(String input, String word1) {   
       //declaring variables
        char letter;
        int guess_ = 0;
        int wrong = 0;
        String guess;
        boolean guessescontainsguess;        String guesses = "";
        boolean guessinword;
  
        
        
        // while loop
        while (wrong < 5 && word1.contains("_")) {
  Scanner input1 = new Scanner(System.in);
            System.out.println(word1 + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {
                System.out.println("You have " + temp
                                   + " guesses left.");}
  
            System.out.print("Your Guess:");
            guess = input1.nextLine();
  
            // converts to uppercase
            guess = guess.toUpperCase();
  
            // gets the first letter
            letter = guess.charAt(0);
            guessescontainsguess
                = (guesses.indexOf(letter)) != -1;
  
            // stores letters
            guesses += letter;
  
            // converts to uppercase 
            letter = Character.toUpperCase(letter);
            System.out.println();
  
            // if letter already guessed
            if (guessescontainsguess == true) {
                System.out.println("You ALREADY guessed "
                                   + letter + ". \n");
            }
            // guessed letter is in the word
            guessinword = (input.indexOf(letter)) != -1;
  
             if (guessinword == true) {
  
                System.out.println(
                    letter + " is present in the word.");
                System.out.print("\n");
  // for loop
  for (int position = 0;
   position < input.length(); position++) {
 
    if (input.charAt(position) == letter
     && word1.charAt(position)
     != letter) {
     word1 = word1.replaceAll("_ ", "_");
     String word2;
     word2 = word1.substring(0, position)
     + letter
     + word1.substring(position
     + 1);
     word2 = word2.replaceAll("_", "_ ");
     word1 = word2;}}}
  
            
            else {
                System.out.println(
                    letter
                    + " is not present in the word.");
                wrong++;}
 
            guess_++;} 
  
        
        
       //if statement
        if (wrong == 5) {
            System.out.println(
                "YOU LOST!, maximum limit of incorrect guesses reached.");}
        else {System.out.print(
                "The word is: " + word1
                + "\n Well Played, you did it!!");}}} 
 