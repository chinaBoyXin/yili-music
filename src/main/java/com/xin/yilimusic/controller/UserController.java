package com.xin.yilimusic.controller;

import com.xin.yilimusic.mapper.UserMapper;
import com.xin.yilimusic.service.UserService;
import com.xin.yilimusic.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<UserVo> list(){
        return userService.list().stream()
                .map(userMapper::toVo).collect(Collectors.toList());
    }
}
