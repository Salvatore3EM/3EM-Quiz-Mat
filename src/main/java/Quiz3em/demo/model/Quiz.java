package Quiz3em.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "visibility")
    private boolean visibility;

    @Column(name = "created_at")
    private String created_at;

    @OneToMany
    List<Question> questions;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    List<Score> scores;

    public Quiz() {
    }

    public Quiz(Long id, String title, boolean visibility, String created_at,List<Question> questions, List<Score> scores) {
        this.id = id;
        this.title=title;
        this.visibility=visibility;
        this.created_at=created_at;
        this.questions=questions;
        this.scores=scores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
