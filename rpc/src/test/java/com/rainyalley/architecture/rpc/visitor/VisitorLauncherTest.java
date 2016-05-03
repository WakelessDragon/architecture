package com.rainyalley.architecture.rpc.visitor; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/** 
* VisitorLauncher Tester. 
*/ 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath:spring-rpc-visitor.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class VisitorLauncherTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /** 
    * 
    * Method: main(String[] args) 
    * 
    */ 
    @Test
    public void testMain() throws Exception { 
        new VisitorLauncher().main(null);
    } 









// private methods ~~~~







} 