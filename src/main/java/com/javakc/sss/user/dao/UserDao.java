package com.javakc.sss.user.dao;

import com.javakc.sss.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,String> {
}
