package com.gaoqi.kitty.service;

import com.gaoqi.kitty.model.Test;
import com.gaoqi.kitty.model.TestExample;

import java.util.List;

public interface TestService {
    List<Test> selectByExample(TestExample example);
}
