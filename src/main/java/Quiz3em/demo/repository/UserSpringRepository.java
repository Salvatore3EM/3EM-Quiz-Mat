package Quiz3em.demo.repository;

import Quiz3em.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringRepository extends JpaRepository <User,Long> {
}
