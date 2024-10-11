package Quiz3em.repository;


import Quiz3em.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerSpringRepository extends JpaRepository<Answer, Long> {

}
