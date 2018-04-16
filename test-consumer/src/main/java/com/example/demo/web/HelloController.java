  
    /**    
    * @Title: HelloController.java  
    * @Package com.example.demo.web  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author ls
    * @date 2018年4月16日  
    * @version V1.0    
    */  
    
package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://test-service/hello", String.class).getBody();
    }

}
