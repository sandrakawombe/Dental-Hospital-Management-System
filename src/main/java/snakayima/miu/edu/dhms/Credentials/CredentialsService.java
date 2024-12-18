package snakayima.miu.edu.dhms.Credentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialsService {

    @Autowired
    private CredentialsRepository credentialsRepository;


    public void registerCredential(CredentialsModel credentials) {
        credentialsRepository.save(credentials);
    }


}
