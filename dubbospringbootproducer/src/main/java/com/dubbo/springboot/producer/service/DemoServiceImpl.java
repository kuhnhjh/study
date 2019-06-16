package com.dubbo.springboot.producer.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.springboot.producer.customize.annotation.MyAopannotation;
import dubbo.api.IDemoService;
import dubbo.api.User;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * Created by huangjh on 2019/1/17.
 */
@Service
@Component
public class DemoServiceImpl implements IDemoService {
    /**
     * 获取用户信息demo
     * @return
     */

    @MyAopannotation
    public User getUerInfo1(String name,int age,String addr) {
       // System.out.println("我接收到请求"+new Date(System.currentTimeMillis()));
        User user=new User();
        user.setName(name+"你好");
        user.setAge(age);
        user.setAddress(addr);
        return user;
    }
    /**
     * 获取用户信息demo
     * @return
     */
    @MyAopannotation
    public User getUerInfo(String name,int age,String addr) {
        // System.out.println("我接收到请求"+new Date(System.currentTimeMillis()));
        User user=new User();
        user.setName(name+"HEllo");
        user.setAge(age);
        user.setAddress(addr);
        return user;
    }
}
