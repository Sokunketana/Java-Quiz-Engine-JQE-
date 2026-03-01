package oop_project.app;

import oop_project.model.*;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> eb01450af1886e80c4e2448ecc481364881eb76f

public class Main 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);

        Exam exam = SampleData.createSampleExam();
        Attempt attempt = new Attempt(exam);

        System.out.println("=== " + exam.getTitle() + " ===");
        System.out.println("Questions: " + exam.getQuestions().size());
        System.out.println();

        for (Questions q : exam.getQuestions()) {
            System.out.println("Q" + q.getNumber() + ": " + q.getText());
            System.out.print("Your answer: ");
            String input = sc.nextLine();

            // Encapsulation: Attempt controls how answers are stored
            attempt.submitAnswer(q.getNumber(), Answer.fromText(input));
            System.out.println();
        }

        // Encapsulation: Exam/Attempt own the rules for scoring
        int score = attempt.calculateScore();
        System.out.println("=== RESULT ===");
        System.out.println("Score: " + score + " / " + exam.getTotalPoints());

        sc.close();
=======
        
>>>>>>> eb01450af1886e80c4e2448ecc481364881eb76f
    }
}