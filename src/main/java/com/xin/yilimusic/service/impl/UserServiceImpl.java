package com.xin.yilimusic.service.impl;

import com.xin.yilimusic.dto.UserDto;
import com.xin.yilimusic.mapper.UserMapper;
import com.xin.yilimusic.repository.UserRepository;
import com.xin.yilimusic.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserDto> list() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto).collect(Collectors.toList());
    }
}
