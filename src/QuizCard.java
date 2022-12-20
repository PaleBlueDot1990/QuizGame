import java.io.*;

public class QuizCard {
    String question;
    String answer;

    QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    String getQuestion() {
        return this.question;
    }

    String getAnswer() {
        return this.answer;
    }
}
