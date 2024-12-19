package snakayima.miu.edu.dhms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import snakayima.miu.edu.dhms.Domain.Dentist;
import snakayima.miu.edu.dhms.Domain.Schedule;
import snakayima.miu.edu.dhms.Repository.DentistRepository;

import java.util.List;

@Service
public class DentistService {

    @Autowired
    private DentistRepository dentistRepository;

    public List<Dentist> getAllDentistsBySchedule(List<Schedule> schedule){
        return dentistRepository.findDentistsBySchedule(schedule);
    }

    public Dentist getDentistById(Long id) {
        return dentistRepository.findById(id).orElse(null);
    }


}
