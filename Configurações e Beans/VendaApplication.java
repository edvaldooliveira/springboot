package desenvolvimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendaApplication {

    @Autowired
    @Qualifier("aplicationName")
    private String aplicationName;

    @GetMapping("/hello")
    public String Helloword(){
        return aplicationName;
    }

    public static void main(String[] args) {
       SpringApplication.run(VendaApplication.class, args);
    }

}
