package com.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger", version = "1.0", description = "Sample Swagger"))
public class SwaggerApplication {

    public static void main (String[] args) {

        SpringApplication.run(SwaggerApplication.class,
                              args);
        System.out.println(SpringVersion.getVersion());
    }

}
