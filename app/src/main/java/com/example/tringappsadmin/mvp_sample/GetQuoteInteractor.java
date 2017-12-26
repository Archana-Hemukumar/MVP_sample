package com.example.tringappsadmin.mvp_sample;

/**
 * Created by Tringapps Admin on 12/14/2017.
 */

public interface GetQuoteInteractor {

    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
