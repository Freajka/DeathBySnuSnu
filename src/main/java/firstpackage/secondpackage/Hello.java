package firstpackage.secondpackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String getStarted() {
        return "Greetings from Iubitica!";
    }


    @RequestMapping("/test")
    public String getStarteds() {
        return "Greetings from Iubitel!";
    }

    @RequestMapping("/iubitica")
    public   String getStartedx() { return "Iubitelul o iubeste pe iubitica mult, mult, mult! :*"; }

}