package com.example.tringappsadmin.mvp_sample;

/**
 * Created by Tringapps Admin on 12/14/2017.
 */

public interface MainContract {

    interface MainView {
        void showProgress();

        void hideProgress();

        void setQuote(String string);
    }

    interface GetQuoteInteractor {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener onFinishedListener);
    }

    interface Presenter {
        void onButtonClick();

        void onDestroy();
    }
}
