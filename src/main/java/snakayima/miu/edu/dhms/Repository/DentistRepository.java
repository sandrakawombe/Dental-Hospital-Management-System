package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import snakayima.miu.edu.dhms.Domain.Dentist;

import java.util.List;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {

    List<Dentist> findByYearsOfExperience();

}
