package pep.mingesoft.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @RequestMapping("/")
    public String holaMundo() {
        int b = 3;
        int c = 5;
        return "Hola Mundo, soy una aplicacion web super simple: " + (b + 4 - 14 + c);
    }

}
