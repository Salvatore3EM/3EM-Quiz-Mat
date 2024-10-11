package Quiz3em.demo.repository;

import Quiz3em.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionSpringRepository extends JpaRepository<Question,Long> {
}
