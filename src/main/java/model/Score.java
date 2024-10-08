package model;

import jakarta.persistence.*;

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
        Answer answer_id;

        @OneToMany
        Quiz quiz_id;


}