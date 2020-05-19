package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: springboot-mybatis-demo
 * @Package: com.example.mapper
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
@Mapper
public interface UserMapper {
    User queryById(int id);
}
