package Quiz3em.repository;

import Quiz3em.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionSpringRepository extends JpaRepository<Question,Long> {
}
