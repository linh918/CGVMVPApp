package com.example.linh918.cgvmvpapp.models;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by linh918 on 28/06/2017.
 */

public class TinMoiHelper {
    private  String url;
    private  OnLoadTinMoiResult onLoadTinMoiResult;
    private List<TinMoi> tinMois;

    public TinMoiHelper(String url) {
        this.url = url;
    }

    public void setOnLoadTinMoiResult(OnLoadTinMoiResult onLoadTinMoiResult) {
        this.onLoadTinMoiResult = onLoadTinMoiResult;
    }

    public void setTinMois(List<TinMoi> tinMois) {
        this.tinMois = tinMois;
    }

    public List<TinMoi> getTinMois() {
        return tinMois;
    }

    public void loadTinMoi(){
        RestAdapter restAdapter= new RestAdapter.Builder().setEndpoint(url).build();
        TinMoiAPI api=restAdapter.create(TinMoiAPI.class);
        api.getTinMoi(new Callback<List<TinMoi>>() {
            @Override
            public void success(List<TinMoi> tinMois, Response response) {

                if(onLoadTinMoiResult!=null){
                    if(tinMois!=null){
                        setTinMois(tinMois);
                        onLoadTinMoiResult.onLoadTinMoiSucces(tinMois);
                    }else{
                        onLoadTinMoiResult.onLoadTinMoiFail();
                    }
                }
            }

            @Override
            public void failure(RetrofitError error) {
                onLoadTinMoiResult.onLoadTinMoiFail();
            }
        });
    }

}
