package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Patient extends Person {

    private String patientId;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointment;



}
