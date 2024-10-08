package Project_Quiz.demo.repository;

import Project_Quiz.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSpringRepository  extends JpaRepository<User, Long> {
}
