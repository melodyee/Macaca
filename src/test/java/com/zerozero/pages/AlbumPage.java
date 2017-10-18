package com.zerozero.pages;

import com.zerozero.common.Locators;
import macaca.client.MacacaClient;

/**
 * Created by libingxin on 29/12/16.
 */
public class AlbumPage {
//    MacacaClient driver = new MacacaClient();

    public static void quitAlbum(MacacaClient driver) throws Exception {
        driver
                .elementByName(Locators.backToHome_name)
                .click();
    }
}
