package Project_Quiz.demo.controller;
import Project_Quiz.demo.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Project_Quiz.demo.service.ScoreSpringService;

import java.util.List;

@RestController
@RequestMapping("/api/score")
public class ScoreController {
    @Autowired
    private ScoreSpringService scoreService;

    @GetMapping
    public List<Score> getAllScore(){
        return scoreService.getAllScore();
    }

    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable Long id){
        return scoreService.getScoreById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable Long id){
        scoreService.deleteScore(id);
    }

}
