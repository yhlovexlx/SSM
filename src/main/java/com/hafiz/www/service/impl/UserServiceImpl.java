package com.hafiz.www.service.impl;

import com.hafiz.www.mapper.UserEntityMapper;
import com.hafiz.www.po.UserEntity;
import com.hafiz.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表相关的servie接口实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }

    @Override
    public void save(UserEntity userEntity) {
        mapper.save(userEntity);
    }


}
