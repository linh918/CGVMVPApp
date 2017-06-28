package com.example.linh918.cgvmvpapp.models;

import java.util.List;

/**
 * Created by linh918 on 28/06/2017.
 */

public interface OnLoadTinMoiResult {
    void onLoadTinMoiSucces(List<TinMoi> tinMois);

    void onLoadTinMoiFail();
}
