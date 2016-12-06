package com.codedocker.nodeDubboExample.demoConsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codedocker.nodeDubboExample.demoApi.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by marshal on 16/12/6.
 */
@Component
public class DubboService {
    @Reference(version = "1.0.0")
    public UserService userService;
}
