package com.sampati.question_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "question_seq", sequenceName = "question_seq", allocationSize = 1)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    private Integer id; // This will automatically increment based on the sequence
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
