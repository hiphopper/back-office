package com.hannt.bo.module.sample.service;

import com.hannt.core.module.sample.service.impl.AbstractSampleServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BackOfficeSampleServiceImpl extends AbstractSampleServiceImpl {
    @Override
    public String getString() {
        return "test String ggg!!";
    }
}
