package Project_Quiz.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pin")
public class Pin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "pinText")
    private String pinText;

    @Column(name = "start")
    private LocalDate start;

    @Column(name = "end")
    private LocalDate end;

    //Constructor
    public Pin() {
    }
    public Pin(Long id, String pinText, LocalDate start, LocalDate end) {
        this.id = id;
        this.pinText=pinText;
        this.start=start;
        this.end=end;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPinText() {
        return pinText;
    }

    public void setPinText(String pinText) {
        this.pinText = pinText;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
