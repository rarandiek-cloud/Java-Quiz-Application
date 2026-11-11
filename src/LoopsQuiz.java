
import java.util.Scanner;

public class LoopsQuiz {

    public static void runLoopsQuiz(Scanner input) {

        // 1. Store the 10 questions
        String[] questions = {
                "Which loop is commonly used when the number of iterations is known?",
                "Which loop checks its condition before executing the body?",
                "Which keyword skips the current iteration of a loop?",
                "Which keyword terminates a loop immediately?",
                "What happens if the condition of a while loop is initially false?",
                "Which loop executes its body at least once?",
                "Which statement creates an infinite loop?",
                "What is the purpose of the increment expression in a for loop?",
                "Which loop is suitable for traversing an array?",
                "What happens if a loop condition never becomes false?"
        };

        // 2. Store the answer options
        String[][] options = {
                {"A. while loop", "B. for loop", "C. do-while loop", "D. switch statement"},

                {"A. do-while loop", "B. for loop", "C. while loop", "D. None of these"},

                {"A. break", "B. return", "C. exit", "D. continue"},

                {"A. continue", "B. break", "C. skip", "D. next"},

                {"A. Executes once", "B. Executes forever", "C. Does not execute", "D. Causes a compiler error"},

                {"A. for loop", "B. while loop", "C. do-while loop", "D. None of these"},

                {"A. for (int i = 0; i < 10; i++)", "B. while (false)", "C. for (int i = 0; i < 5; i++)", "D. while (true)"},

                {"A. To stop the loop", "B. To skip an iteration", "C. To update the loop variable", "D. To declare a method"},

                {"A. switch", "B. for loop", "C. if statement", "D. try-catch"},

                {"A. The loop stops automatically", "B. The program enters an infinite loop", "C. The compiler fixes it", "D. The loop executes once"}
        };

        // 3. Store the correct answers
        char[] answers = {
                'B', 'C', 'D', 'B', 'C', 'C', 'D', 'C', 'B', 'B'
        };

        Quiz.runQuiz("Loops", questions, options, answers, input);
    }
}
