package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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


}
