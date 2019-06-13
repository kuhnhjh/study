package com.consumer.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.consumer.service.ConsumerService;
import dubbo.api.IDemoService;
import dubbo.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangjh on 2019/1/17.
 */
@RestController
public class ConsumerContorller {
    @Autowired
    private ConsumerService consumerService;

    @ResponseBody
    @RequestMapping(value = "/getUserInfo")
    public  User getUserInfo(@RequestParam String name,@RequestParam int age,@RequestParam String address) {
        User user=consumerService.getUserMod(name,age,address);
        return user;
    }
}
