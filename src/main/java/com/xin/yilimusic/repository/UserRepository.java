package com.xin.yilimusic.repository;

import com.xin.yilimusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User getByUsername(String userName);
}
