package Quiz3em.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "created_at")
    private String created_at;

    @ManyToMany
    List<Answer> answer_id;

    @ManyToOne
    Quiz quiz;

    public Score() {
    }

    public Score(Long id, String email, String name, String lastname, String created_at, List<Answer> answer_id, Quiz quiz) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.created_at = created_at;
        this.answer_id = answer_id;
        this.quiz = quiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<Answer> getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(List<Answer> answer_id) {
        this.answer_id = answer_id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
