package com.dc.cloud.cloudconsumer.service;

import com.dc.cloud.cloudconsumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-05
 */
@Service
public class RibbonService   {
    @Resource
    private RestTemplate restTemplate;

    public User findById(Long id){
        // 拼接URL
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id,
                User.class);
    }
}
