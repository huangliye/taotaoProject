package com.taotao.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServieImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public String getNow() {
        return testMapper.getNow();
    }
}
