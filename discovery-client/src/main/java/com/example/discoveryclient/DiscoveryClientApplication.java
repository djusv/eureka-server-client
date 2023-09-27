package com.example.discoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DiscoveryClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(DiscoveryClientApplication.class, args);
  }
}
