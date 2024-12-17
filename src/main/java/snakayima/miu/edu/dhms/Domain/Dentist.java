package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;

@Entity
public class Dentist extends Person {

    private String workerId;
    private int yearsOfExperience;


    public Dentist() {}


}
