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


    protected Dentist() {}

    public Dentist(Person person, String workerId, int yearsOfExperience) {
        this.workerId = workerId;
        this.yearsOfExperience = yearsOfExperience;

    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(List<Appointment> appointment) {
        this.appointment = appointment;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Dentist{" +
                "workerId='" + workerId + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", appointment=" + appointment +
                ", schedule=" + schedule +
                '}';
    }
}
