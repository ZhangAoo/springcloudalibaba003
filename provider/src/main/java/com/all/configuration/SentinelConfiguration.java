package com.all.configuration;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.all.exception.ExceptionHandler;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SentinelConfiguration {

    @PostConstruct
    public void init(){
//        WebCallbackManager.setRequestOriginParser(new RequestOriginParseDefinition());
        WebCallbackManager.setUrlBlockHandler(new ExceptionHandler());
    }

}
