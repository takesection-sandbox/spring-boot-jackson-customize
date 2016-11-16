package jp.pigumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
public class DemoController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(name = "exists", required = false) String exists) {
        if (null == exists) {
            return "null";
        } else {
            return "not null";
        }
    }

    @GetMapping("/test")
    public LocalDateTime jacksonTest() {
        return LocalDateTime.of(1970, 1, 1, 0, 0, 0, 0);
    }

}
