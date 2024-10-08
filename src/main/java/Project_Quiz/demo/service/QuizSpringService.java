package Project_Quiz.demo.service;
import Project_Quiz.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Project_Quiz.demo.repository.QuizSpringRepository;

import java.util.List;

@Service
public class QuizSpringService {
    @Autowired
    private QuizSpringRepository quizRepository;

    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id){
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz saveQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Long id){
        quizRepository.deleteById(id);
    }

    public void updateQuiz(Long id, Quiz quiz){
        Quiz oldQuiz = quizRepository.findById(id).orElse(null);
        if(oldQuiz!=null){
            oldQuiz.setTitle(quiz.getTitle());
            oldQuiz.setVisibility(quiz.isVisibility());
            oldQuiz.setCreated_at(quiz.getCreated_at());
        }
        quizRepository.save(oldQuiz);
    }
}
