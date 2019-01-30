package com.gaoqi.kitty.service.Impl;

import com.gaoqi.kitty.mapper.TestMapper;
import com.gaoqi.kitty.model.Test;
import com.gaoqi.kitty.model.TestExample;
import com.gaoqi.kitty.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> selectByExample(TestExample example) {
        return testMapper.selectByExample(example);
    }
}
