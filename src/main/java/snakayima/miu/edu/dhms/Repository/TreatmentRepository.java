package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snakayima.miu.edu.dhms.Domain.Treatment;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}
