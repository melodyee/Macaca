package com.zerozero.autoTestCase;

import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by libingxin on 19/12/16.
 */
public class TestTutorialPage {
    MacacaClient driver = new MacacaClient();

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

