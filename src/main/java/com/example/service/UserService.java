package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: springboot-mybatis-demo
 * @Package: com.example.service
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
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User queryById(int id){
        return userMapper.queryById(id);
    }
}
