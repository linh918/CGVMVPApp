package com.example.linh918.cgvmvpapp.views;

import com.example.linh918.cgvmvpapp.models.TinMoi;

import java.util.List;

/**
 * Created by linh918 on 28/06/2017.
 */

public interface TinMoiView {
    void reLoad();

    void showNoData();

    void showError();

    void showTinMoiList(List<TinMoi> tinMois);

}
