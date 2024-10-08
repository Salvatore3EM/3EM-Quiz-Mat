package Project_Quiz.demo.repository;

import Project_Quiz.demo.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinSpringRepository extends JpaRepository<Pin, Long> {
}
