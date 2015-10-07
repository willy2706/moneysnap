package com.moneysnap.helper;

/**
 * Created by nim_13512065 on 10/8/15.
 */
public enum RobotoFontHelper {
    ROBOTO_THIN ("Roboto-Thin.ttf");

    private String ASSET_PATH = "fonts/roboto/";
    private final String fontName;
    public String getResourcesPath() {
        return ASSET_PATH + fontName;
    }

    RobotoFontHelper(String fontName) {
        this.fontName = fontName;
    }
}
