package snakayima.miu.edu.dhms.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Person {
    @Id@GeneratedValue
    private int id;
    private String name;
    private int age;
    private String gender;
    private Date DOB;
    private String phoneNumber;



}
