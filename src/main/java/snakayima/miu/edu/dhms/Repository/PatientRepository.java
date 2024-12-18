package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import snakayima.miu.edu.dhms.Domain.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {


    List<Patient> findPatientBy(Long id);

    List<Patient> findPatientBy(Long id, String name);




}
