package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snakayima.miu.edu.dhms.Domain.Dentist;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
