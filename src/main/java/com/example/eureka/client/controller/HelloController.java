package com.example.eureka.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-22 ProjectName:eureka-client Version:
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private DiscoveryClient client;


    @RequestMapping("/index")
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("service provider:"+instance.getHost()+":"+instance.getPort());
        return "Hello World";
    }
}