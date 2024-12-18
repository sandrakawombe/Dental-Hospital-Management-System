package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import snakayima.miu.edu.dhms.Domain.Appointment;

import java.util.List;
@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByPatientId(Long patientId);

}
