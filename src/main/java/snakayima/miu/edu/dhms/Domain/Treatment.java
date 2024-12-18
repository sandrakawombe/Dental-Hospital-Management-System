package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Treatment {

    @Id
    private int id;
    private String treatmentType;
    private double cost;
    private String description;

    @ManyToOne
    @JoinColumn(name ="appointment_id")
    private Appointment appointment;

    protected Treatment() {}
    public Treatment(String treatmentType, double cost, String description) {
        this.treatmentType = treatmentType;
        this.cost = cost;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "id=" + id +
                ", treatmentType='" + treatmentType + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
