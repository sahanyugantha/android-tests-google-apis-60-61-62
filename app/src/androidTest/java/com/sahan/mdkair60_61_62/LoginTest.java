package com.sahan.mdkair60_61_62;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LoginTest {

    public String email = "admin@abc.lk";
    public String password = "12345";
    public User unexpected = null;

    @Before
    public void setUp(){

    }

    @Test
    public void loginTest(){
        LoginDAO loginDAO = new LoginDAO();
        User actual = loginDAO.loginChecker(email, password);
        Assert.assertNotEquals(unexpected, actual);
    }

    @After
    public void tearDown(){

    }

}
