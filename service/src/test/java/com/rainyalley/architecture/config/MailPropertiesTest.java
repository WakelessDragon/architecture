package com.rainyalley.architecture.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = {ServiceConfiguration.class})
@SpringBootApplication
public class MailPropertiesTest {

    @Resource
    private MailProperties mailProperties;

    @Value("${mail.host}")
    private String location;

    @Test
    public void run(){
        Assert.assertNotNull(location);
        Assert.assertEquals(mailProperties.getHost(),location);
    }
}