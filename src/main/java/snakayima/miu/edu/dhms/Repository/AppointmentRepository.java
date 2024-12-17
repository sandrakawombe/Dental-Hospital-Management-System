package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snakayima.miu.edu.dhms.Domain.Appointment;

public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {
}
