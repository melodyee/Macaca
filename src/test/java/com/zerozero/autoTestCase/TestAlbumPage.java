package com.zerozero.autoTestCase;

import com.alibaba.fastjson.JSONObject;
import com.zerozero.common.MyUtils;
import macaca.client.MacacaClient;
import org.junit.After;
import org.junit.Before;

/**
 * Created by libingxin on 29/12/16.
 */
public class TestAlbumPage {
    MacacaClient driver = new MacacaClient();

    @Before
    public void setUp() throws Exception {
        JSONObject porps = new JSONObject();
        MyUtils.setCapabilityForNonFirstInstall(porps);
        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities",porps);
        driver.initDriver(desiredCapabilities);
        driver.sleep(2000);

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
