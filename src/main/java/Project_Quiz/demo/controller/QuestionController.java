package Project_Quiz.demo.controller;

import Project_Quiz.demo.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Project_Quiz.demo.service.QuestionSpringService;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

        @Autowired
        private QuestionSpringService questionService;

        @GetMapping
        public List<Question> getAllQuestions(){

            return questionService.getAllQuestions();
        }

        @GetMapping("/{id}")
        public Question getQuestionsById(@PathVariable Long id){
            return questionService.getQuestionsById(id);
        }

        @PostMapping
        public Question createQuestions(@RequestBody Question questions){
            return questionService.saveQuestions((questions));
        }

        @PostMapping("/{all}")
        public List<Question> createNewQuestions(List<Question> questionsList) {
            return questionService.createNewQuestions(questionsList);
        }

        @DeleteMapping("/{id}")
        public void deleteQuestions(@PathVariable Long id){
            questionService.deleteQuestions(id);
        }

        @PutMapping("/{id}")
        public void updateQuestions(@PathVariable Long id, @RequestBody Question question)
        {
            questionService.updateQuestions(id, question);
        }
}
