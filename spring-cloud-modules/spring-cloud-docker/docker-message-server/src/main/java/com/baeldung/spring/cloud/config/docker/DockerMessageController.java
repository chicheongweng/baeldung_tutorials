package com.baeldung.spring.cloud.config.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
    @GetMapping("/api/v1.1/messages")
    public String getMessage() {
        return "Hello from messages service! Url path: /api/v1.1/messages";
    }
}
