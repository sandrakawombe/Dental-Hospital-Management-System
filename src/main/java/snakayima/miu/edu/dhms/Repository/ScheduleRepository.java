package snakayima.miu.edu.dhms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import snakayima.miu.edu.dhms.Domain.Schedule;

public interface ScheduleRepository  extends JpaRepository<Schedule, Long> {
}
