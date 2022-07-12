package com.xin.yilimusic.repository;

import com.xin.yilimusic.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RoleRepositoryTest {
    @Resource
    private RoleRepository roleRepositor;

    @Test
    void saveRole(){
        Role role = new Role();
        role.setName("admin");
        role.setTitle("管理员");
        roleRepositor.save(role);

    }

}