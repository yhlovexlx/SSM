package com.hafiz.www.po;

/**
 * 用户表实体类
 */
public class UserEntity {
    private Integer id;            // 编号
    private String username;    // 用户名
    private String password;    // 密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
