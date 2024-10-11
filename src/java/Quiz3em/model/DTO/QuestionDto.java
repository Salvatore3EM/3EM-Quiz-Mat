package Quiz3em.model.DTO;

import java.util.List;

public class QuestionDto {
    public String question_text;
    public String created_at;
    List<AnswerDto> answers;

    public QuestionDto() {
    }

    public QuestionDto(String question_text, String created_at, List<AnswerDto> answers) {
        this.question_text = question_text;
        this.created_at = created_at;
        this.answers = answers;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<AnswerDto> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerDto> answers) {
        this.answers = answers;
    }
}
