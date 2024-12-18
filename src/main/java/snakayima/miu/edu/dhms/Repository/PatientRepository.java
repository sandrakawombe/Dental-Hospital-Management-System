package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snakayima.miu.edu.dhms.Domain.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {


    List<Patient> findPatientBy(Long id);

    List<Patient> findPatientBy(Long id, String name);


}
