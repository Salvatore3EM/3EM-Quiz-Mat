package Project_Quiz.demo.controller;

import Project_Quiz.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Project_Quiz.demo.service.QuizSpringService;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    private QuizSpringService quizService;

    @GetMapping
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
        return quizService.getQuizById(id);
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz((quiz));
    }

    @DeleteMapping("/{id}")
    public void deleteQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(id);
    }

    @PutMapping("/{id}")
    public void updateQuiz(@PathVariable Long id, @RequestBody Quiz quiz) {
        quizService.updateQuiz(id, quiz);
    }
}
