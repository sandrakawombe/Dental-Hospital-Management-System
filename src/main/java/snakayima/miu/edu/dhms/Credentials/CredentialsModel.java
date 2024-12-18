package snakayima.miu.edu.dhms.Credentials;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CredentialsModel {

    @Id@GeneratedValue
    private long id;
    private String username;
    private String password;
}
