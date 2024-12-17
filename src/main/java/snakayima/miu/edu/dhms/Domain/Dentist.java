package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Dentist extends Person {

    private String workerId;
    private int yearsOfExperience;

    @OneToMany
    private List<Appointment> appointment;

    @OneToMany
    private List<Schedule> schedule;


    public Dentist() {}


}
