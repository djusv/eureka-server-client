package com.example.discoveryserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.event.EventListener;


public class EurekaListener {

  Logger logger = LoggerFactory.getLogger(EurekaListener.class);

  @EventListener(id = "handleRegisteredEvent")
  void handleRegisteredEvent(EurekaInstanceRegisteredEvent event) {
    logger.info("registered: " + event);
    logger.info("registered-metadata: " + event.getInstanceInfo().getMetadata());
  }

  @EventListener(id = "handleRenewedEvent")
  void handleRenewedEvent(EurekaInstanceRenewedEvent event) {
    logger.info("renewed: " + event);
    logger.info("renewed-metadata: " + event.getInstanceInfo().getMetadata());
  }

  @EventListener(id = "handleCancelledEvent")
  void handleCancelledEvent(EurekaInstanceCanceledEvent event) {
    logger.info("cancelled: " + event);
  }
}
