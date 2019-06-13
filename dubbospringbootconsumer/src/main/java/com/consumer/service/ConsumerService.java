package com.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.api.IDemoService;
import dubbo.api.User;
import org.springframework.stereotype.Component;

/**
 * Created by 10331 on 2019/6/1.
 */
@Component
public class ConsumerService {
    @Reference
    IDemoService demoService;
//    @HystrixCommand(fallbackMethod = "getUser")
    public User getUserMod( String name,int age,String address){
       return demoService.getUerInfo(name,age,address);
    }

    public User getUser(){
        User user=new User();
        user.setName("hjhhjh");
        return user;
    }

}
