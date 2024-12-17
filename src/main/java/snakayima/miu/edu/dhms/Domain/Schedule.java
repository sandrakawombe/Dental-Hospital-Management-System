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


}
