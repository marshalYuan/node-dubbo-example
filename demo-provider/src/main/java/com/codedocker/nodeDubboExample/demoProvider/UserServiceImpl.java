package com.codedocker.nodeDubboExample.demoProvider;

import com.alibaba.dubbo.config.annotation.Service;
import com.codedocker.nodeDubboExample.demoApi.User;
import com.codedocker.nodeDubboExample.demoApi.UserService;

/**
 * Created by marshal on 16/12/6.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    public User findByName(String name) {
        System.out.println(name);
        User user = new User();
        user.setAge(19);
        user.setName(name);
        return user;
    }
}
