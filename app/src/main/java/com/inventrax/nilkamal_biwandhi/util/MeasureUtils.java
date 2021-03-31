package com.inventrax.nilkamal_biwandhi.util;


import com.inventrax.nilkamal_biwandhi.application.AbstractApplication;

public class MeasureUtils {

    public static int pxToDp(int px) {
        final float scale = AbstractApplication.get().getResources().getDisplayMetrics().density;
        return (int) ((px * scale) + 0.5f);
    }

}
