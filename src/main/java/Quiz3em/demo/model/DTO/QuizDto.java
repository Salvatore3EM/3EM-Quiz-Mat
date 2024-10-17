package Quiz3em.demo.model.DTO;

import java.util.ArrayList;
import java.util.List;

public class QuizDto {
    public String quizTitle;
    public boolean visibility = true;
    public String created_at;
    public List<QuestionDto> questions = new ArrayList<>();

    public QuizDto() {
    }

    public QuizDto(String quizTitle, boolean visibility, String created_at) {
        this.quizTitle = quizTitle;
        this.visibility = visibility;
        this.created_at = created_at;
    }

    public String getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        this.quizTitle = quizTitle;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<QuestionDto> getQuestionDtoList() {
        return questions;
    }

    public void setQuestionDtoList(List<QuestionDto> questionDtoList) {
        this.questions = questionDtoList;
    }
}