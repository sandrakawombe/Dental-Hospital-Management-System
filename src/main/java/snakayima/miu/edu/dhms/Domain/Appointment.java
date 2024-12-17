package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    @Id@GeneratedValue
    private int id;
    private String title;
    private String description;
    private String date;
    private String time;

}
