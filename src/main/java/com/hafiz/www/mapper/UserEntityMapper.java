package com.hafiz.www.mapper;

import com.hafiz.www.po.UserEntity;

import java.util.List;

/**
 * 用户表实体mapper接口类
 */
public interface UserEntityMapper {

    /**
     * 查找所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();

    void save(UserEntity userEntity);
}
