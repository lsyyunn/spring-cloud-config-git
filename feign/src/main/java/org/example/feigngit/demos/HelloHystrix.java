package org.example.feigngit.demos;

import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements MyFeign{
    @Override
    public String hello() {
        return "出现错误";
    }
}
