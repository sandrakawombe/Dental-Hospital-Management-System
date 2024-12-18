package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import snakayima.miu.edu.dhms.Domain.Dentist;
import snakayima.miu.edu.dhms.Domain.Schedule;

import java.util.List;

@Repository
public interface ScheduleRepository  extends JpaRepository<Schedule, Long> {

    List<Schedule> findByDentist(Dentist dentist);
}
