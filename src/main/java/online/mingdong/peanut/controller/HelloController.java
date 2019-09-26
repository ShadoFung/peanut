package online.mingdong.peanut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shado
 */
@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public Object hello() {
        return "Hello Peanut!";
    }
    
}