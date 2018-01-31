package com.hafiz.www.controller;

import com.hafiz.www.po.UserEntity;
import com.hafiz.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        List<UserEntity> list = userService.getAllUsers();
        return list;
    }

    @Transactional
    @RequestMapping(value = "/save")
    public Map save(@RequestParam String username,@RequestParam String password){

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        userService.save(userEntity);

        int m = 2/0;

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("message","OK");
        return map;


    }
}
