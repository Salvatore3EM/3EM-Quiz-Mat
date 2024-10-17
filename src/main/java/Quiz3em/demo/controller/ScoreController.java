package Quiz3em.demo.controller;

import Quiz3em.demo.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Quiz3em.demo.service.ScoreSpringService;

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

    @PostMapping("/submit")
    public ResponseEntity<String> submit(@RequestBody Score score) {
        scoreService.saveScore(score);
        return ResponseEntity.ok("Score saved in database");
    }
}