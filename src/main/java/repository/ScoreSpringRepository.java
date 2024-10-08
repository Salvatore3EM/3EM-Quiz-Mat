package repository;

import model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreSpringRepository extends JpaRepository<Score, Long> {
}
