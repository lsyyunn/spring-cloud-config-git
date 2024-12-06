package org.example.feigngit.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    MyFeign myFeign;
    @RequestMapping("/hello")
    public String hello() {
        return myFeign.hello();
    }
}
