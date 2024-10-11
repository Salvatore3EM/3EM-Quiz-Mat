package Quiz3em.repository;

import Quiz3em.model.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PinSpringRepository extends JpaRepository<Pin,Long> {
}
