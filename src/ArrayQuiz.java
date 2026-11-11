import java.util.Scanner;

public class ArrayQuiz {
    public static void runArrayQuiz(Scanner input) {

        // 1. Store the 10 questions in an array

        String[] questions = {
                "What is an array in Java?",
                "What is the index of the first element in an array?",
                "Which symbol is used to declare an array in Java?",
                "Which of the following correctly declares an integer array?",
                "What will be the length of the following array? " +
                        "int[] arr = {1, 2, 3, 4, 5}",
                "Which method/property is used to get the length of an array?",
                "Which loop is commonly used to access array elements?",
                "What happens if you access an index outside the array size?",
                "Which keyword is used to create an array object?",
                "Arrays in Java are stored in:"

        };

        // 2. Store the answer options
        // This is done using a two-dimensional Array for rows and columns

        String [][] options = {
                {"A. Different data types", "B. Elements of the same type", "C. A loop structure", "D. A conditional statement"},

                {"A. 1", "B. -1", "C. 0", "D. 10",},

                {"A. ()", "B. {}", "C. []", "D. 10"},

                {"A. int arr[];", "B. array int arr;", "C. arr int[];", "D. int (arr);"},

                {"A. 4", "B. 5", "C. 6", "D. 10"},

                {"A. length()", "B. size()", "C. length", "D. getLength()"},

                {"A. while loop", "B. for loop", "C. do-while loop", "D. All of the above"},

                {"A. Program always stops", "B. ArrayIndexOutOfBoundsException", "C. Compiler error", "D. Nothing happens"},

                {"A. create", "B. new", "C. make", "D. array"},

                {"A. Stack memory", "B. Heap memory", "C. CPU register", "D. Disk memory"}


        };

        // 3.Store the correct answers
        // Stores a single character
        char[] answers = {
                'B', 'C', 'C', 'A', 'B', 'C', 'D', 'B', 'B', 'B'
        };

        Quiz.runQuiz("Arrays", questions, options, answers, input);
    }
}
