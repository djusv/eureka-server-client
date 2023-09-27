package com.example.discoveryclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.ApplicationInfoManager;

@RestController
public class HelloController {
  @Autowired
  private ApplicationInfoManager aim;

  @RequestMapping("/hello")
  public String home() {
      return "Hello world, from " + aim.getInfo().getInstanceId();
  }
}
