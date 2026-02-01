package oop_project.data;

import oop_project.model.Exams;
import oop_project.model.Questions;

import java.util.ArrayList;
import java.util.List;

public class SampleData {
    public static Exams createSampleExam() {
        List<Questions> questions = new ArrayList<>();

        questions.add(new Questions(
                1,
                "Answer is a",
                "a",
                2
        ));

        questions.add(new Questions(
                2,
                "Answer is a",
                "a",
                2
        ));

        questions.add(new Questions(
                3,
                "Answer is a",
                "a",
                2
        ));

        return new Exams("Test", questions);
    }

}
