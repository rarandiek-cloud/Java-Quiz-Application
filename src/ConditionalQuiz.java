
import java.util.Scanner;

public class ConditionalQuiz {

    public static void runConditionalQuiz(Scanner input) {

        // 1. Store the 10 questions
        String[] questions = {
                "Conditional statements are used to:",
                "Which keyword is used for decision making?",
                "Which statement provides multiple conditions?",
                "Which statement is used to select one option from many choices?",
                "What symbol is used for equality comparison?",
                "Which operator represents not equal to?",
                "Which logical operator means AND?",
                "Which logical operator means OR?",
                "Which block executes when the condition in an if statement is false?",
                "Which statement structure is correct?"
        };

        // 2. Store the answer options
        String[][] options = {

                {"A. Store data", "B. Make decisions in a program", "C. Repeat instructions", "D. Declare variables"},

                {"A. loop", "B. if", "C. class", "D. new"},

                {"A. if statement", "B. if-else statement", "C. else-if ladder", "D. loop statement"},

                {"A. if", "B. switch", "C. loop", "D. array"},

                {"A. =", "B. ==", "C. !=", "D. <>"},

                {"A. ==", "B. !=", "C. >=", "D. <="},

                {"A. &&", "B. ||", "C. !", "D. =="},

                {"A. &&", "B. ||", "C. !", "D. =="},

                {"A. if block", "B. else block", "C. loop block", "D. array block"},

                {"A. if(condition){ }", "B. if condition", "C. if{}", "D. condition if"}
        };

        // 3. Store the correct answers
        char[] answers = {
                'B', 'B', 'C', 'B', 'B', 'B', 'A', 'B', 'B', 'A'
        };

        Quiz.runQuiz("Conditional Statements", questions, options, answers, input);
    }
}
