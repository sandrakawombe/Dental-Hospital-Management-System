package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Dentist extends Person {

    private String workerId;
    private int yearsOfExperience;

    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointment;

    @OneToMany(mappedBy = "dentist")
    private List<Schedule> schedule;


    public Dentist() {}


}
