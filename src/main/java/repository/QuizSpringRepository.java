package repository;

import model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizSpringRepository extends JpaRepository<Quiz, Long> {
}
