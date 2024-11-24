package com.epicbattle.epicb_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Epic Battle API", version = "1.0", description = "Documentation of Epic Battle API"))
public class SwaggerConfig {
}
