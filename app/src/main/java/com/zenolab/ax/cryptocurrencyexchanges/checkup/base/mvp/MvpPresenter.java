package com.zenolab.ax.cryptocurrencyexchanges.checkup.base.mvp;

public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void viewIsReady();

    void detachView();

    void destroy();
}
