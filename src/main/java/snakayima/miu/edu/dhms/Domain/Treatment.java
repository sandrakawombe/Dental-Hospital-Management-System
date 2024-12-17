package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Treatment {

    @Id
    private int id;
    private String treatmentType;
    private double cost;
    private String description;

    @ManyToOne
    private Appointment appointment;








}
