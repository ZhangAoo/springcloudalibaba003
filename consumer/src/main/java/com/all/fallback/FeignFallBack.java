package com.all.fallback;

import com.all.feign.ProvierFeign;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack  implements ProvierFeign {
    @Override
    public String list() {
        return "list-fallback";
    }

    @Override
    public String test1() {
        return "test1-fallback";
    }
}
