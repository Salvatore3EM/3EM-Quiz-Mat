package Quiz3em.controller;

import Quiz3em.model.Answer;
import Quiz3em.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Quiz3em.service.AnswerSpringService;

import java.util.List;

@RestController
@RequestMapping("/api/answer")
public class AnswerController {
    @Autowired
    private AnswerSpringService answerService;

    @GetMapping
    public List<Answer> getAllAnswer(){

        return answerService.getAllAnswer();
    }

    @GetMapping("/{id}")
    public Answer getAnswerById(@PathVariable Long id){
        return answerService.getAnswerById(id);
    }

    @PostMapping
    public Answer createAnswer(@RequestBody Answer answer){
        return answerService.saveAnswer((answer));
    }

    @PostMapping("/{all}")
    public List<Answer> createNewAnswer(List<Answer> answerList) {
        return answerService.createNewAnswer(answerList);
    }

    @DeleteMapping("/{id}")
    public void deleteAnswer(@PathVariable Long id){
        answerService.deleteAnswer(id);
    }

    @PutMapping("/{id}")
    public void updateAnswer(@PathVariable Long id, @RequestBody Question question) {
        answerService.updateAnswer(id, question);
    }
}
