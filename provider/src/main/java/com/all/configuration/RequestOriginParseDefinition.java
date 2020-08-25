package com.all.configuration;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;

import javax.servlet.http.HttpServletRequest;

public class RequestOriginParseDefinition implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        return name;
    }
}
