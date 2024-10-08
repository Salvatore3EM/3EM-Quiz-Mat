package Project_Quiz.demo.service;


import Project_Quiz.demo.model.Question;
import org.springframework.stereotype.Service;
import Project_Quiz.demo.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import Project_Quiz.demo.repository.AnswerSpringRepository;

import java.util.List;

@Service
public class AnswerSpringService {
    @Autowired
    private AnswerSpringRepository answerRepository;

    public List<Answer> getAllAnswer() {
        return answerRepository.findAll();
    }

    public Answer getAnswerById(Long id){
        return answerRepository.findById(id).orElse(null);
    }

    public Answer saveAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public List<Answer> createNewAnswer(  List<Answer> answer) {
        return answerRepository.saveAll(answer);
    }

    public void deleteAnswer(Long id){
        answerRepository.deleteById(id);
    }

    public void updateAnswer(Long id, Question question)
    {
        Answer oldAnswer = answerRepository.findById(id).orElse(null);
        if(oldAnswer!=null){
            oldAnswer.setAnswerText(oldAnswer.getAnswerText());
            oldAnswer.setCorrect(oldAnswer.isCorrect());
            oldAnswer.setCreated_at(oldAnswer.getCreated_at());
        }
        answerRepository.save(oldAnswer);
    }
}
