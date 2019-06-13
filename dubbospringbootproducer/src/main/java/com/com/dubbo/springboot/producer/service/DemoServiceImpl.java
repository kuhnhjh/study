package com.com.dubbo.springboot.producer.service;


import com.alibaba.dubbo.config.annotation.Service;
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
//    @HystrixCommand
    public User getUerInfo(String name,int age,String addr) {
        System.out.println("我接收到请求"+new Date(System.currentTimeMillis()));
        User user=new User();
        user.setName(name+"你好");
        user.setAge(age);
        user.setAddress(addr);
//        if(age>30){
//            throw new RuntimeException("年龄大于30");
//        }
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return user;
    }
}
