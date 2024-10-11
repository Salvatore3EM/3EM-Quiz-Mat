package Quiz3em.service;

import Quiz3em.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Quiz3em.repository.QuestionSpringRepository;

import java.util.List;

@Service
public class QuestionSpringService {
    @Autowired
    private QuestionSpringRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionsById(Long id){
        return questionRepository.findById(id).orElse(null);
    }

    public Question saveQuestions(Question questions){
        return questionRepository.save(questions);
    }

    public List<Question> createNewQuestions(  List<Question> question) {
        return questionRepository.saveAll(question);
    }

    public void deleteQuestions(Long id){
        questionRepository.deleteById(id);
    }

    public void updateQuestions(Long id, Question question) {
        Question oldQuestion = questionRepository.findById(id).orElse(null);
        if(oldQuestion!=null){
            oldQuestion.setQuestionText(question.getQuestionText());
            oldQuestion.setCreated_at(oldQuestion.getCreated_at());
            oldQuestion.setVisibility(oldQuestion.getisVisibility());
        }
        questionRepository.save(oldQuestion);
    }

    public void toogleVisibility(Long id){
        Question question = questionRepository.findById(id).orElse(null);
        if(question.getisVisibility()==true){
            question.setVisibility(false);
            questionRepository.save(question);
        }else if (question.getisVisibility()==false){
            question.setVisibility(true);
            questionRepository.save(question);
        }
    }
}
