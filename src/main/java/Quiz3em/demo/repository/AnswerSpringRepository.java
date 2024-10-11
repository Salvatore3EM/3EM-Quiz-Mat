package Quiz3em.demo.repository;


import Quiz3em.demo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerSpringRepository extends JpaRepository<Answer, Long> {

}
