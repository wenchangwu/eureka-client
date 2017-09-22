package com.example.eureka.client.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-22 ProjectName:eureka-client Version:
 */
@RestController
public class HelloController {

    private DiscoveryClient client;


    public String index(){
        ServiceInstance instance=client.getLocalServiceInstance();
        return "Hello World";
    }
}