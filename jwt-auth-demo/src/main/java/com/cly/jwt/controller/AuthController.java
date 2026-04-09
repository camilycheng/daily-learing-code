package com.cly.jwt.controller;

import com.cly.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        Map<String, Object> result = new HashMap<>();
        
        if ("admin".equals(username) && "123456".equals(password)) {
            String token = jwtUtil.generateToken(username);
            result.put("code", 200);
            result.put("message", "登录成功");
            result.put("token", token);
        } else {
            result.put("code", 401);
            result.put("message", "用户名或密码错误");
        }
        
        return result;
    }

    @GetMapping("/user/info")
    public Map<String, Object> getUserInfo(HttpServletRequest request) {
        String username = (String) request.getAttribute("username");
        
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "获取用户信息成功");
        
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("username", username);
        userInfo.put("role", "admin");
        result.put("data", userInfo);
        
        return result;
    }

    @GetMapping("/hello")
    public Map<String, Object> hello(HttpServletRequest request) {
        String username = (String) request.getAttribute("username");
        
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "访问成功");
        result.put("data", "Hello, " + username + "! 欢迎使用 JWT 认证系统");
        
        return result;
    }
}
