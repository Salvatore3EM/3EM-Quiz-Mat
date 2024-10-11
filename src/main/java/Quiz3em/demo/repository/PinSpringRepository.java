package Quiz3em.demo.repository;

import Quiz3em.demo.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinSpringRepository extends JpaRepository<Pin,Long> {
}
