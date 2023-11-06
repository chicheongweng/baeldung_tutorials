package com.baeldung.spring.cloud.config.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerProductController {
    @GetMapping("/api/v1.1/products")
    public String getMessage() {
        return "Hello from products service! Url path: /api/v1.1/products";
    }
}
