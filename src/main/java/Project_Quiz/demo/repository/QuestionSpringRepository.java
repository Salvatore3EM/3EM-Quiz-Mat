package Project_Quiz.demo.repository;

import Project_Quiz.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionSpringRepository extends JpaRepository<Question, Long> {
}
