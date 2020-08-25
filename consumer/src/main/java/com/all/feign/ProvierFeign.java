package com.all.feign;

import com.all.fallback.FeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = FeignFallBack.class)
public interface ProvierFeign {

    @GetMapping("/list")
    public String list();
    @GetMapping("/test1")
    public String test1();
}
