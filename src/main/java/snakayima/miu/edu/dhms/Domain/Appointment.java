package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Appointment {

    @Id@GeneratedValue
    private int id;
    private String title;
    private String description;
    private String date;
    private String time;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Dentist dentist;

    @OneToMany
    private List<Treatment> treatmentList;



}
