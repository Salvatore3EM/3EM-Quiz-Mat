package Quiz3em.demo.repository;

import Quiz3em.demo.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreSpringRepository extends JpaRepository<Score,Long> {
}
