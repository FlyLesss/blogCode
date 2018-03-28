package com.example.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    private final String swagger2_api_basepackage = "com.example.demo.web";  
    private final String swagger2_api_title = "用户-API";  
    private final String swagger2_api_description = "用户信息的api";  
    private final String swagger2_api_contact = "ls";  
    private final String swagger2_api_version = "1.0";  
    /** 
     * createRestApi 
     * 
     * @return 
     */  
    @Bean  
    public Docket createRestApi() {  
        return new Docket(DocumentationType.SWAGGER_2)  
                .apiInfo(apiInfo())  
                .select()  
                .apis(RequestHandlerSelectors.basePackage(swagger2_api_basepackage))  
                .paths(PathSelectors.any())  
                .build();  
    }  
    /** 
     * apiInfo 
     * @return 
     */  
    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title(swagger2_api_title)  
                .description(swagger2_api_description)  
                .contact(swagger2_api_contact)  
                .version(swagger2_api_version)  
                .build();  
    }  
}
