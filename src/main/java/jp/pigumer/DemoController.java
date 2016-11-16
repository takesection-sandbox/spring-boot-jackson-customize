package jp.pigumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(name = "exists", required = false) String exists) {
        /*
        if (null == exists) {
            return "null";
        } else {
            return "not null";
        }
        */
        return Demo.exists(exists);
    }

    @GetMapping("/test")
    public LocalDateTime jacksonTest() {
        LocalDateTime zero = Demo.foo();
        assert(zero.equals(LocalDateTime.of(1970, 1, 1, 0, 0 , 0, 0)));

        return zero;
    }

}
