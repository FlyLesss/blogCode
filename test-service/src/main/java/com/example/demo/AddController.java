package com.example.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
    	 Integer r = a + b;
    	client.getServices().forEach(id -> {
    		client.getInstances(id).forEach(instance -> {
                logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId()+" result:" + r);
            });
        });
   
        return r;
    }
}
