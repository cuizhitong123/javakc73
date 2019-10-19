package com.javakc.sss.user.service;

import com.javakc.sss.user.entity.UserEntity;
import org.springframework.data.domain.Page;

public interface UserService {
    public void save(UserEntity entity);
    public void update(UserEntity entity);
    public void delete(UserEntity entity);
    public void delete(String userId);
    public void delete(String[] userIds);
    public UserEntity queryById(String userId);
    public Page<UserEntity> queryByPage(UserEntity entity,int offset,int limit);

}
