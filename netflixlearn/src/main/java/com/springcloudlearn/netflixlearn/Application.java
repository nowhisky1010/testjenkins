package com.springcloudlearn.netflixlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.security.AlgorithmConstraints;

/**
 * Created by zhul-a on 2016/9/5.
 */
//开启一个服务注册中心,已经上传GIT
@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
