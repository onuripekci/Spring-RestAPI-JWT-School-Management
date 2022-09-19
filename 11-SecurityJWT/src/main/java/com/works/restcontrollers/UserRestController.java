package com.works.restcontrollers;

import com.works.entities.User;
import com.works.props.JWTLogin;
import com.works.services.UserDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

    final UserDetailService service;
    public UserRestController(UserDetailService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/auth")
    public ResponseEntity auth(@RequestBody JWTLogin jwtLogin) {
        return service.auth(jwtLogin);
    }

}