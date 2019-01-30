package com.gaoqi.kitty.controller;

import com.gaoqi.kitty.model.Test;
import com.gaoqi.kitty.model.TestExample;
import com.gaoqi.kitty.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "user/select",method = RequestMethod.GET)
    public List<Test> select(TestExample example){
        return testService.selectByExample(example);
    }
}
