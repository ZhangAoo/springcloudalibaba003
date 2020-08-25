package com.all.controller;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.all.feign.ProvierFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ProvierFeign provierFeign;

//    @GetMapping("/test")
//    public String test(){
//        //查询Nacos中已经存在的服务
//        List<ServiceInstance> list = this.discoveryClient.getInstances("provider");
//        List<String> urls = list.stream()
//                .map(e->e.getUri().toString()+"/index").collect(Collectors.toList());
//        int index = ThreadLocalRandom.current().nextInt(urls.size());
//        String url = urls.get(index);
//        log.info("请求的地址是：{}", url);
//        return this.restTemplate.getForObject(url, String.class);
//    }

//    @GetMapping("/index")
//    public String index(){
//        return this.restTemplate.getForObject("http://provider/index", String.class);
//    }
//
//    @GetMapping("/test")
//    public String test(){
////        return this.restTemplate.getForObject("http://provider/index", String.class);
//        return this.provierFeign.index();
//    }

    @GetMapping("/list")
    public String list(){
        return this.provierFeign.list();
    }

    @GetMapping("/index")
    public String test1(){
        return "consumer";
    }
}
