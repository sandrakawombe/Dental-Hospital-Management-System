package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import snakayima.miu.edu.dhms.Domain.Treatment;
@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {

}
