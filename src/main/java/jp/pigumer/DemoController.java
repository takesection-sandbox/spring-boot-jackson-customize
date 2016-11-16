package jp.pigumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
