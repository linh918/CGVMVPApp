package com.example.linh918.cgvmvpapp.models;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by linh918 on 21/06/2017.
 */

public interface TinMoiAPI {

    @GET("/tinuudai/getall")
    public  void  getTinMoi(Callback<List<TinMoi>> response);
}
