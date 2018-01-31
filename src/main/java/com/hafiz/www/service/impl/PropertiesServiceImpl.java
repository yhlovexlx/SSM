package com.hafiz.www.service.impl;

import com.hafiz.www.service.PropertiesService;
import com.hafiz.www.util.PropertyConfigurer;
import com.hafiz.www.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Author：yanghl
 * Desc：
 * Date: 2017/3/21.
 */
@Service
public class PropertiesServiceImpl implements PropertiesService {

    @Value("${test}")
    private String testDataByFirst;

    @Value("#{prop.test2}")
    private String testDataBySecond;

    @Value("#{propertiesReader[test3]}")
    private String testDataByThird;

    @Autowired
    private PropertyConfigurer pc;

    @Override
    public String getProperyByFirstWay() {
        return testDataByFirst;
    }

    @Override
    public String getProperyBySecondWay() {
        return testDataBySecond;
    }

    @Override
    public String getProperyByThirdWay() {
        return testDataByThird;
    }

    @Override
    public String getProperyByFourthWay(String key) {
        return pc.getProperty(key);
    }

    @Override
    public String getProperyByFourthWay(String key, String defaultValue) {
        return pc.getProperty(key, defaultValue);
    }

    @Override
    public String getProperyByFifthWay(String key) {
        return PropertyUtil.getProperty(key);
    }


    @Override
    public String getProperyByFifthWay(String key, String defaultValue) {
        return PropertyUtil.getProperty(key, defaultValue);
    }
}
