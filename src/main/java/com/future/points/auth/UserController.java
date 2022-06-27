package com.future.points.auth;

import com.alibaba.cola.dto.Response;
import com.future.points.auth.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public Response add(CreateUserCommandRequest request) {
        DefaultUser user = DefaultUser.of(request.getUsername(), request.getPhone());
        userService.add(user);
        return Response.buildSuccess();
    }
}