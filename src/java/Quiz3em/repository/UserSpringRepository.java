package Quiz3em.repository;

import Quiz3em.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringRepository extends JpaRepository <User,Long> {
}
