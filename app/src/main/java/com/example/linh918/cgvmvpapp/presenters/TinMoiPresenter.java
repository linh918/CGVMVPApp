package com.example.linh918.cgvmvpapp.presenters;

import android.support.annotation.NonNull;
import android.widget.ListView;

import com.example.linh918.cgvmvpapp.models.OnLoadTinMoiResult;
import com.example.linh918.cgvmvpapp.models.TinMoi;
import com.example.linh918.cgvmvpapp.models.TinMoiHelper;
import com.example.linh918.cgvmvpapp.views.TinMoiView;

import java.util.List;

/**
 * Created by linh918 on 28/06/2017.
 */

public class TinMoiPresenter implements OnLoadTinMoiResult {
    private TinMoiView view;
    private TinMoiHelper model;

    public TinMoiPresenter(TinMoiView view, TinMoiHelper model) {
        this.view = view;
        this.model = model;
        this.model.setOnLoadTinMoiResult(this);
    }

    public  void getData(){
        view.reLoad();
        model.getTinMois();

    }
    @Override
    public void onLoadTinMoiSucces(@NonNull  List<TinMoi> tinMois) {
        if(tinMois.size()>0){
            view.showTinMoiList(tinMois);
        }else {
            view.showNoData();
        }
    }

    @Override
    public void onLoadTinMoiFail() {
        view.showError();
    }
}
