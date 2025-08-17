import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    String question;
    String[] options;
    int correctOption;

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }


}

public class QuizApp {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding some sample questions
        questions.add(new Question(
                "What is the capital of France?",
                new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
                3
        ));

        questions.add(new Question(
                "Which language runs in a web browser?",
                new String[]{"1. Java", "2. C", "3. Python", "4. JavaScript"},
                4
        ));

        questions.add(new Question(
                "Who developed Java?",
                new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Google", "4. IBM"},
                2
        ));

        int score = 0;

        System.out.println("=== Welcome to the Online Quiz App ===");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println("Correct...!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is option " + q.correctOption + ".\n");
            }
        }

        System.out.println("=== Quiz Finished! ===");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}

