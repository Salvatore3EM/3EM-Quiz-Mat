package Quiz3em.demo.service;

import Quiz3em.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import Quiz3em.demo.repository.UserSpringRepository;

import java.util.List;

@Service
public class UserSpringService {
    @Autowired
    private UserSpringRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(Long id, User user) {
        User oldUser = userRepository.findById(id).orElse(null);
        if (oldUser != null) {
            oldUser.setName(user.getName());
            oldUser.setSurname(user.getSurname());
            oldUser.setEmail(user.getEmail());
            oldUser.setPassword(user.getPassword());
        }
        userRepository.save(oldUser);
    }

    public void register(){

        User user = new User();
        user.setName(user.getName());
        user.setSurname(user.getSurname());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        userRepository.save(user);

        if(user == null){
            ResponseEntity.badRequest();
        }else {
            ResponseEntity.ok("admin found");
        }
    }
}
