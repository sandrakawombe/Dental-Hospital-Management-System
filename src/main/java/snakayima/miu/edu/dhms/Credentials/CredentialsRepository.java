package snakayima.miu.edu.dhms.Credentials;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CredentialsRepository extends JpaRepository<CredentialsModel, Long> {
}
