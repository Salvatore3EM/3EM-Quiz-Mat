package Project_Quiz.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "questionText")
    private String questionText;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "visibility")
    private boolean visibility;

    @ManyToOne
    Quiz quiz_id;

    //Constructor
    public Question() {
    }
    public Question(Long id, String questionText, String created_at, boolean visibility, Quiz quiz_id) {
        this.id = id;
        this.questionText=questionText;
        this.created_at=created_at;
        this.visibility=visibility;
        this. quiz_id=quiz_id;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public Quiz getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(Quiz quiz_id) {
        this.quiz_id = quiz_id;
    }
}