package snakayima.miu.edu.dhms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import snakayima.miu.edu.dhms.Domain.Patient;
import snakayima.miu.edu.dhms.Repository.PatientRepository;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }


}
