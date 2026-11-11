
import java.util.Scanner;

public class MethodsQuiz {

    public static void runMethodsQuiz(Scanner input) {

        // 1. Store the 10 questions
        String[] questions = {
                "What is a function (method) in Java?",
                "Which keyword is used to define a method in Java?",
                "Which of the following is a correct method declaration?",
                "Which keyword is used to return a value from a method?",
                "What is the purpose of methods in programming?",
                "What is the name of the method that starts execution of a Java program?",
                "Which of the following is the correct main method signature?",
                "What are parameters in a method?",
                "A method that does not return any value uses which keyword?",
                "What is the process of calling a method called?"
        };

        // 2. Store the answer options
        String[][] options = {

                {"A. A variable", "B. A block of code that performs a specific task", "C. A loop structure", "D. An array element"},

                {"A. function", "B. method", "C. void or return type", "D. define"},

                {"A. void display()", "B. display void()", "C. method display()", "D. function display()"},

                {"A. break", "B. continue", "C. return", "D. exit"},

                {"A. To repeat code", "B. To store data", "C. To organize code into reusable blocks", "D. To declare arrays"},

                {"A. run()", "B. start()", "C. main()", "D. begin()"},

                {"A. public static void main(String args[])", "B. main()", "C. void main", "D. public main()"},

                {"A. Variables passed to a method", "B. Loop conditions", "C. Array elements", "D. Output values"},

                {"A. null", "B. void", "C. empty", "D. static"},

                {"A. Method declaration", "B. Method execution", "C. Method invocation", "D. Method storage"}
        };

        // 3. Store the correct answers
        char[] answers = {
                'B', 'C', 'A', 'C', 'C', 'C', 'A', 'A', 'B', 'C'
        };

        Quiz.runQuiz("Functions / Methods", questions, options, answers, input);
    }
}