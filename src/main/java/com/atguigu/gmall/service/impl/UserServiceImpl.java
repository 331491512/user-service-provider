package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

public class UserServiceImpl implements UserService {

    /**
     * 一个普通的返回结果的方法
     * 
     * @param userId 无意义
     */
    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress u1 = new UserAddress();
        u1.setUserId("1");
        u1.setAddress("北京");

        UserAddress u2 = new UserAddress();
        u2.setUserId("2");
        u2.setAddress("上海");

        UserAddress u3 = new UserAddress();
        u3.setUserId("3");
        u3.setAddress("广州");

        UserAddress u4 = new UserAddress();
        u4.setUserId("4");
        u4.setAddress("深圳");

        return Arrays.asList(u1, u2, u3, u4);
    }

}
