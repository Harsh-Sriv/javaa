import java.util.Scanner;
import java.util.Random;
public class NumberGuessingServer {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Random random = new Random();
 int targetNumber = random.nextInt(9) + 1;
 int userGuess;
 System.out.println("Welcome to the Number Guessing Game!");
 do {
 System.out.print("Guess a number between 1 and 9: ");
 userGuess = scanner.nextInt();
 if (userGuess == targetNumber) {
 System.out.println("Well guessed!");
 break;
 } else {
 System.out.println("Try again.");
 }
 } while (true);
 scanner.close();
 }
}