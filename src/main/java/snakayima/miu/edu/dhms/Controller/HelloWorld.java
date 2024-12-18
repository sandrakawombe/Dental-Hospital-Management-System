package snakayima.miu.edu.dhms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    Hello helloService;

    @RequestMapping(method = RequestMethod.GET,path ="/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return helloService.greeting(name);
    }
}
