package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.*;
import snakayima.miu.edu.dhms.DentalHospitalManagementSystemApplication;

import java.time.LocalDateTime;

@Entity
public class Schedule {
    @Id@GeneratedValue
    private int id;
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    private int status;
    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;

    protected Schedule() {}

    public Schedule(String title, String description, String startTime, String endTime, int status) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
