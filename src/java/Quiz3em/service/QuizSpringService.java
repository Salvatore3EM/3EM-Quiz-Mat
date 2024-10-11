package Quiz3em.service;

import Quiz3em.model.DTO.QuestionDto;
import Quiz3em.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Quiz3em.repository.AnswerSpringRepository;
import Quiz3em.repository.QuestionSpringRepository;
import Quiz3em.repository.QuizSpringRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class QuizSpringService {
    @Autowired
    private QuizSpringRepository quizRepository;
    @Autowired
    private QuestionSpringRepository questionRepository;
    @Autowired
    private AnswerSpringRepository answerRepository;

    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    public Quiz saveQuiz(Quiz quiz) {
        quiz.setCreated_at(LocalDate.now().toString());
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Long id) {
        quizRepository.deleteById(id);
    }

    public void updateQuiz(Long id, Quiz quiz) {
        Quiz oldQuiz = quizRepository.findById(id).orElse(null);
        if (oldQuiz != null) {
            oldQuiz.setTitle(quiz.getTitle());
            oldQuiz.setVisibility(quiz.isVisibility());
            oldQuiz.setCreated_at(quiz.getCreated_at());
        }
        quizRepository.save(oldQuiz);
    }

    public List<Quiz> visibleQuizzes() {
        return quizRepository.findAllByVisibilityTrue();
    }

    public Object addQuiz(int quiz_id, QuestionDto questionList) {
//        for (int i = 0; i < questionList.size(); i++) {
//            Question question = questionList.get(i);
//            question.setQuiz_id(quiz_id);
//            question.setCreated_at(LocalDate.now().toString());
//            questionRepository.saveAll(NewQuestionsList);
//            addQuiz.add(question);
//            Answer answer1 = answerList.get(i);
//            do {
//                for (int j = 0; j < answerList.size(); j++) {
//                    Answer answer2 = answerList.get(j);
//                    answer2.setCreated_at(LocalDate.now().toString());
//                    answerRepository.saveAll(NewAnswerList);
//                    addQuiz.add(answer2);
//                }
//            } while (answer1.getQuestion_id().equals(question.getId()));
//        }
        return null;
    }
}
