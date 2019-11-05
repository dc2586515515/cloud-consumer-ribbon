package com.dc.cloud.cloudconsumer.controller;

import com.dc.cloud.cloudconsumer.service.RibbonService;
import com.dc.cloud.cloudconsumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-05
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return ribbonService.findById(id);
    }
}
