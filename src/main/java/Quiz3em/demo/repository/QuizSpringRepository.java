package Quiz3em.demo.repository;

import Quiz3em.demo.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizSpringRepository  extends JpaRepository<Quiz, Long> {
    List<Quiz> findAllByVisibilityTrue();
}
