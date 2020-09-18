package com.example.demo1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：LiuJianhua
 * @date ：Created in 2020/9/17 15:07
 * @description :
 */
@RestController
@RequestMapping("api/user")
public class UserController
{
    private final UserService service;

    public UserController(UserService userService)
    {
        this.service = userService;
    }

    @GetMapping("test")
    public String test()
    {
        return "Hello world";
    }

    @GetMapping("all")
    public List<UserEntity> getAll()
    {
        return this.service.getAll();
    }

    @PostMapping("save")
    public void save(@RequestBody UserEntity user)
    {
        this.service.save(user);
    }
}
