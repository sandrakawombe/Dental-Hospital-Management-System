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

    protected Appointment() {}

    public Appointment(String title, String description, String date, String time) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;

    }

    public void add(Treatment treatment) {
        treatmentList.add(treatment);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public List<Treatment> getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(List<Treatment> treatmentList) {
        this.treatmentList = treatmentList;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", patient=" + patient +
                ", dentist=" + dentist +
                ", treatmentList=" + treatmentList +
                '}';
    }
}
