package Quiz3em.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pin")
public class Pin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "pinText")
    private String pinText;

    @Column(name = "start")
    private LocalDateTime start;

    @Column(name = "end")
    private LocalDateTime end;

    //Constructor
    public Pin() {
    }
    public Pin(Long id, String pinText, LocalDateTime start, LocalDateTime end) {
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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
