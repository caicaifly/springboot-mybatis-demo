package com.example.controller;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: springboot-mybatis-demo
 * @Package: com.example.controller
 * @Description: note
 * @Author: xiangdc16781
 * @CreateDate: 2020-05-19 16:39
 * @UpdateUser: xiangdc16781
 * @UpdateDate: 2020-05-19 16:39
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@RestController
@RequestMapping("test")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser/{id}")
    public String getUset(@PathVariable int id){
        return userService.queryById(id).toString();
    }
}
