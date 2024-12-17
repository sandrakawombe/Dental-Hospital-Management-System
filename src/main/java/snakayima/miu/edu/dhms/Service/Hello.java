package snakayima.miu.edu.dhms.Service;

import org.springframework.stereotype.Service;

@Service
public class Hello {

    private String name;


    public String greeting(String name){
        return "Hello, " + name + "!";
    }
}
