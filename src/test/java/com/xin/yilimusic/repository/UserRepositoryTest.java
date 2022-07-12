package com.xin.yilimusic.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xin.yilimusic.entity.User;
import com.xin.yilimusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
class UserRepositoryTest {

    @Resource
    UserRepository userRepository;

    @Resource
    ObjectMapper objectMapper;

    @Test
    void getByUsername() {
        User user = new User();
        user.setUsername("test");
        user.setGender(Gender.FEMALE);
        user.setNickname("测试");
        user.setPassword("123456");
        user.setLocked(false);
        user.setEnabled(true);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());
        User save = userRepository.save(user);

        List<User> users = userRepository.findAll();
//        User test = userRepository.getByUsername("test");
        System.out.println(users);
    }

}