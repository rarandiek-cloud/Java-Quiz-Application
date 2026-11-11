
import java.util.Scanner;

public class Quiz {

    // Reusable method for all the topics
    public static void runQuiz(String topic,
                               String[] questions,
                               String[][] options,
                               char[] answers,
                               Scanner input) {

        // Check if the three arrays have matching lengths
        if (questions.length != options.length ||
                questions.length != answers.length) {

            System.out.println("Error: Questions, options and answers do not match.");
            return;
        }

        // Add score counter
        int correct = 0;

        // Loop through all questions
        for (int i = 0; i < questions.length; i++) {

            // Display the question
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);

            // Nested loop: display all four answer options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            // Get and validate the user's answer
            String userAnswer;

            while (true) {

                System.out.print("Your answer (A, B, C, D): ");

                userAnswer = input.next().trim().toUpperCase();

                if (userAnswer.equals("A") || userAnswer.equals("B") ||
                        userAnswer.equals("C") || userAnswer.equals("D")) {

                    break;

                } else {
                    System.out.println("Invalid answer. Please enter A, B, C or D.");
                }
            }

            // Check whether the answer is correct
            if (userAnswer.charAt(0) == answers[i]) {

                System.out.println("GOOD JOB... Correct!");
                correct++;

            } else {

                System.out.println("Incorrect.");
                System.out.println("Correct answer: " + answers[i]);
            }
        }

        // Calculate incorrect answers
        int wrong = questions.length - correct;

        // Display final results
        System.out.println("\n================================");
        System.out.println("          QUIZ RESULTS");
        System.out.println("================================");

        System.out.println("Topic: " + topic);
        System.out.println("Total questions: " + questions.length);
        System.out.println("Correct answers: " + correct);
        System.out.println("Wrong answers: " + wrong);
        System.out.println("Total score: " + correct + "/" + questions.length);

        System.out.println("================================");
    }
}
