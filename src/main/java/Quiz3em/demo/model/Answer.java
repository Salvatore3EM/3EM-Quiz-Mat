package Quiz3em.demo.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "answerText")
    private String answerText;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    @Column(name = "created_at")
    private String created_at;

    @ManyToOne
    Question question_id;

    @ManyToMany
    List<Answer> answers;

    //Constructor
    public Answer() {
    }
    public Answer(Long id, String answerText, boolean isCorrect, String created_at, Question question_id) {
        this.id = id;
        this.answerText=answerText;
        this.isCorrect=isCorrect;
        this.created_at=created_at;
        this.question_id=question_id;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Question getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Question question_id) {
        this.question_id = question_id;
    }

    public void getIsCorrect() {

    }
}
