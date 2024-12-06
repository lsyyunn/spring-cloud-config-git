package org.example.feigngit.demos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

@Primary
@FeignClient(name = "service-provider" ,fallback = HelloHystrix.class)
public interface MyFeign {
    @RequestMapping(value = "/hello")
    public String hello();
}
