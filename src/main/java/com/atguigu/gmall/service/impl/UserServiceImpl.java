package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress u1 = new UserAddress();
        u1.setUserId("1");
        u1.setAddress("北京");

        UserAddress u2 = new UserAddress();
        u2.setUserId("1");
        u2.setAddress("上海");

        return Arrays.asList(u1, u2);
    }

}
