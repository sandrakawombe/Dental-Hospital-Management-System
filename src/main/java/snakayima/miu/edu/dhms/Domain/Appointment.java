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
    @JoinColumn(name = "Patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "Dentist_id")
    private Dentist dentist;

    @OneToMany(mappedBy = "appointment")
    private List<Treatment> treatmentList;



}
