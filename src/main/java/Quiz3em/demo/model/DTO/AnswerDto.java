package Quiz3em.demo.model.DTO;

public class AnswerDto {
    public String answer_text;
    public String is_correct;
    public String created_at;

    public AnswerDto() {
    }

    public AnswerDto(String answer_text, String is_correct, String created_at) {
        this.answer_text = answer_text;
        this.is_correct = is_correct;
        this.created_at = created_at;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    public boolean getIs_correct() {
        return is_correct;
    }

    public void setIs_correct(String is_correct) {
        this.is_correct = is_correct;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
