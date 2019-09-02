package com.gl.orderManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class OrderManagementAppApplication {

    public static void main(String[] args) {
        System.setProperty("javax.net.ssl.trustStore","D:\\ssl_server.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","greenlearner");
        SpringApplication.run(OrderManagementAppApplication.class, args);
    }

}
