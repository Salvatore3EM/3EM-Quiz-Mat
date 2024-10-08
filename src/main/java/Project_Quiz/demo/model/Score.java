package Project_Quiz.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Score")
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
        Quiz quiz_id;


}