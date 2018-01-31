package com.hafiz.www.service;

import com.hafiz.www.po.UserEntity;

import java.util.List;

/**
 * 用户表相关的service接口
 */
public interface UserService {

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();


    void save(UserEntity userEntity);
}
