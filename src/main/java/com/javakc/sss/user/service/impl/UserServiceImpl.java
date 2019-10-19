package com.javakc.sss.user.service.impl;

import com.javakc.sss.user.dao.UserDao;
import com.javakc.sss.user.entity.UserEntity;
import com.javakc.sss.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false)
    public void save(UserEntity entity) {
        userDao.save(entity);
    }

    @Transactional(readOnly = false)
    public void update(UserEntity entity) {
        userDao.save(entity);

    }

    @Transactional(readOnly = false)
    public void delete(UserEntity entity) {
        userDao.delete(entity);

    }

    @Transactional(readOnly = false)
    public void delete(String userId) {
        userDao.deleteById(userId);

    }

    @Transactional(readOnly = false)
    public void delete(String[] userIds) {
        if (!StringUtils.isEmpty(userIds) && userIds.length > 0) {
            for (String userId : userIds) {
                userDao.deleteById(userId);
            }

        }

    }

    public UserEntity queryById(String userId) {
        return userDao.findById(userId).get();
    }

    public Page<UserEntity> queryByPage(UserEntity entity, int offset, int limit) {
        PageRequest pagable = PageRequest.of(offset, limit);
        return userDao.findAll(pagable);

    }
}