package com.example.discoveryclient;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.ApplicationInfoManager;

@Component
public class DynamicMetadata {

  Logger logger = LoggerFactory.getLogger(DynamicMetadata.class);

  @Autowired
  private ApplicationInfoManager aim;

  @Scheduled(fixedRate = 10000)
  public void scheduledTask() {
    String now = Instant.now().toString();
    logger.info("updating metadata! - " + now);
    var metadata = aim.getInfo().getMetadata();
    metadata.put("dynamic-prop", now);
    aim.registerAppMetadata(metadata);
  }
}
