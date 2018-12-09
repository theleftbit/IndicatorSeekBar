package com.warkiz.widget;

/**
 * A callback to provide a custom string to show given a progress
 */
public interface OnCustomStringListener {
    /**
     * Client has the opportunity to provide a custom String to show in the indicator given a progress
     *
     * @param progress the current progress of the seekbar
     */
    String onProgress(float progress);
}
