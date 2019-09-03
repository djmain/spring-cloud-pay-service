package com.jay.spring.cloud.service.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringCloudPayServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringCloudPayServiceApplication.class, args);
    }

}
