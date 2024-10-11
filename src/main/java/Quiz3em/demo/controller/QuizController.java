package Quiz3em.demo.controller;

import Quiz3em.demo.model.DTO.QuestionDto;
import Quiz3em.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Quiz3em.demo.service.QuizSpringService;

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

    @GetMapping("/allVisible")
    public ResponseEntity<List<Quiz>> getAllVisibleQuiz(){
        List<Quiz> visibleQuizzess = quizService.visibleQuizzes();
        return ResponseEntity.ok(visibleQuizzess);
    }

    @PostMapping("/all/{quiz_id}")
    public ResponseEntity<Quiz> getQuiz(@PathVariable Long id){
        Quiz quiz = quizService.getQuizById(id);
        return ResponseEntity.ok(quiz);
    }

    @PostMapping("/add/{quiz_id}")
    public Object addQuiz(@PathVariable int quiz_id, @RequestBody List<QuestionDto> questions){
        return quizService.addQuiz((long) quiz_id,questions);
    }
}