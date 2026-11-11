
import java.util.Scanner;

public class OOPQuiz {

    public static void runOOPQuiz(Scanner input) {

        // Store the 10 questions
        String[] questions = {
                "What does OOP stand for?",
                "Which concept allows objects to have properties and behavior?",
                "What is a class in Java?",
                "An object is:",
                "Which keyword is used to create an object in Java?",
                "Which of the following is an example of encapsulation?",
                "Inheritance allows a class to:",
                "Which keyword is used for inheritance in Java?",
                "Polymorphism means:",
                "Which concept hides internal implementation details?"
        };

        // Store the answer options
        String[][] options = {
                {"A. Object-Oriented Programming", "B. Object Operating Program", "C. Operational Object Programming", "D. Organized Object Program"},

                {"A. Looping", "B. Encapsulation", "C. Compilation", "D. Iteration"},

                {"A. A variable", "B. A blueprint for creating objects", "C. A loop structure", "D. A conditional statement"},

                {"A. A function", "B. An instance of a class", "C. A loop", "D. A compiler"},

                {"A. create", "B. object", "C. new", "D. make"},

                {"A. Storing data and methods in one class", "B. Repeating a loop", "C. Writing conditional statements", "D. Declaring arrays"},

                {"A. Repeat code", "B. Use properties and methods of another class", "C. Store arrays", "D. Perform loops"},

                {"A. inherit", "B. extend", "C. extends", "D. implement"},

                {"A. Many variables", "B. Many forms of a method or object", "C. Many loops", "D. Many classes"},

                {"A. Encapsulation", "B. Looping", "C. Iteration", "D. Compilation"}
        };

        char[] answers = {
                'A', 'B', 'B', 'B', 'C', 'A', 'B', 'C', 'B', 'A'
        };

        Quiz.runQuiz("Object-Oriented Programming Basics", questions, options, answers, input);
    }
}
