package oop_project.app;

import oop_project.model.*;
import oop_project.data.SampleData;
import java.util.Scanner;
 public class Main 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        UserRegistry registry = new UserRegistry();
        registry.registerUser("student1", "1234", "student");

        System.out.println("=== Login to Enter Quiz ===");
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if (!registry.validateLogin(username, password)) {
            System.out.println("Invalid login. Exiting.");
            sc.close();
            return;
        }

        User myUser = registry.getUser(username);
        if (myUser != null) {
            System.out.println("Welcome, role: " + myUser.getRole());
        }

        Exam exam = SampleData.createSampleExam();
        Attempt attempt = new Attempt(exam);

        System.out.println("=== " + exam.getTitle() + " ===");
        System.out.println("Questions: " + exam.getQuestions().size());
        System.out.println();

        for (Question q : exam.getQuestions()) {
            System.out.println("Q" + q.getNumber() + ": " + q.getText());
            System.out.print("Your answer: ");
            String input = sc.nextLine();

            attempt.submitAnswer(q.getNumber(), Answer.fromText(input));
            System.out.println();
        }

        int score = attempt.calculateScore();
        System.out.println("=== RESULT ===");
        System.out.println("Score: " + score + " / " + exam.getTotalPoints());

        sc.close();
    }
}
