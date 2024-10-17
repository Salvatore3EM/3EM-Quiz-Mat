package Quiz3em.demo.service;

import Quiz3em.demo.model.Answer;
import Quiz3em.demo.model.DTO.AnswerDto;
import Quiz3em.demo.model.DTO.QuestionDto;
import Quiz3em.demo.model.DTO.QuizDto;
import Quiz3em.demo.model.Question;
import Quiz3em.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Quiz3em.demo.repository.AnswerSpringRepository;
import Quiz3em.demo.repository.QuestionSpringRepository;
import Quiz3em.demo.repository.QuizSpringRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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

    public Object addQuiz(QuizDto quiz) {

        List<Question> questions = new ArrayList<Question>();
        List<Question> NewQuestion = new ArrayList<>();
        List<Answer> answers = new ArrayList<Answer>();
        List<Object> addQuiz = new ArrayList<Object>();
        QuestionDto questionDTO = null;
        List<QuestionDto> questionsDTOList;
        AnswerDto answerDTO = null;
        List<AnswerDto> answerDTOList;
        Quiz NewQuiz = new Quiz();

        NewQuiz.setTitle(quiz.getQuizTitle());
        NewQuiz.setVisibility(quiz.isVisibility());
        NewQuiz.setCreated_at(LocalDate.now().toString());
        addQuiz.add(NewQuiz);
        quizRepository.save(NewQuiz);

        questionsDTOList = quiz.getQuestionDtoList();

        for (int i = 0; i < questionsDTOList.size(); i++) {
            questionDTO = questionsDTOList.get(i);

            Question question = new Question();
            question.setQuestionText(questionDTO.getQuestion_text());
            question.setVisibility(questionDTO.isVisibility());
            question.setCreated_at(LocalDate.now().toString());

            question.setQuiz_id(quizRepository.findById(NewQuiz.getId()).orElse(null));

            questionRepository.save(question);
            addQuiz.add(question);

            answerDTOList = questionDTO.getAnswers();

            for (int j = 0; j < answerDTOList.size(); j++) {
                answerDTO = answerDTOList.get(j);

                Answer answer = new Answer();
                answer.setAnswerText(answerDTO.getAnswer_text());
                answer.setCorrect(answerDTO.getIs_correct());
                answer.setCreated_at(LocalDate.now().toString());
                answer.setQuestion_id(questionRepository.findById(question.getId()).orElse(null));

                answerRepository.save(answer);
                addQuiz.add(answer);
            }
        }
        return addQuiz;
    }
}