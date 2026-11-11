
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 6) {

            System.out.println("\nWelcome to the Java Quiz Application");
            System.out.println("1. Arrays");
            System.out.println("2. Loops");
            System.out.println("3. Conditional Statements");
            System.out.println("4. Functions / Methods");
            System.out.println("5. Object-Oriented Programming Basics");
            System.out.println("6. Exit");

            System.out.print("Enter your choice:");

            // Validate the data using try-catch exception handling
            try {
                choice = input.nextInt();

                // Validate the number range
                if (choice <1 || choice >6) {
                    System.out.println("INVALID.");
                    System.out.println("Please enter a number between 1 and 6.");
                    //Continue stops current iteration of loop and returns to the beginning of while loop
                    continue;
                }
            } catch (InputMismatchException e){
                System.out.println("INVALID.");
                System.out.println("Please enter a number.");
                input.next(); // Remove invalid input
                continue;
            }

            // Execute the Quiz
            switch (choice) {
                case 1:
                    ArrayQuiz.runArrayQuiz(input);
                    break;

                case 2:
                    LoopsQuiz.runLoopsQuiz(input);
                    break;

                case 3:
                    ConditionalQuiz.runConditionalQuiz(input);
                    break;

                case 4:
                    MethodsQuiz.runMethodsQuiz(input);
                    break;

                case 5:
                    OOPQuiz.runOOPQuiz(input);
                    break;

                case 6:
                    System.out.println("Thank you for using the Quiz Application");
                    break;

                default:
                    System.out.println("INVALID.");
                    System.out.println("Please select a number between 1 and 6.");
            }
        }

        input.close();
    }
}
