package Quiz3em.demo.service;

import Quiz3em.demo.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Quiz3em.demo.repository.ScoreSpringRepository;

import java.util.List;

@Service
public class ScoreSpringService {
    @Autowired
    private ScoreSpringRepository scoreRepository;

    public List<Score> getAllScore(){
        return scoreRepository.findAll();
    }

    public Score getScoreById(Long id) {
        return scoreRepository.findById(id).orElse(null);
    }

    public Score saveScore(Score score){
        return scoreRepository.save(score);
    }

    public void deleteScore(Long id){
        scoreRepository.deleteById(id);
    }

    public void submitScore(){

    }
}
