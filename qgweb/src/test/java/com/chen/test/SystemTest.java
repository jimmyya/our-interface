package com.chen.test;

import com.qg.dao.SystemDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by CHEN on 2016/7/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-*.xml"
})
public class SystemTest {
    @Autowired
    private SystemDao systemDao;

    @Test
    public void deleteSystem() {

    }
}
