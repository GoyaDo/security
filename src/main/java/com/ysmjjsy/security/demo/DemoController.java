package com.ysmjjsy.security.demo;

import com.ysmjjsy.security.auth.AuthenticationResponse;
import com.ysmjjsy.security.auth.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author cj
 * @since 2023-01-23
 */
@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
