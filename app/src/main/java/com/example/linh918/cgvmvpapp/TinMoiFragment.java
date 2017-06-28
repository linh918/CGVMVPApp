package com.example.linh918.cgvmvpapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.linh918.cgvmvpapp.models.TinMoi;
import com.example.linh918.cgvmvpapp.models.TinMoiHelper;
import com.example.linh918.cgvmvpapp.presenters.TinMoiPresenter;
import com.example.linh918.cgvmvpapp.views.TinMoiView;

import java.util.List;


public class TinMoiFragment extends Fragment implements TinMoiView,View.OnClickListener {
    private List<TinMoi> mTinMois;
    private RecyclerView mRcvTinMoi;
    private Button mBtnReload;
    private static final  String url="";
    private TinMoiPresenter mTinMoiPresenter;
    private TinMoiHelper mTinMoiHelper;


    public TinMoiFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(mTinMoiPresenter==null){
            if(mTinMoiHelper==null){
                mTinMoiHelper=new TinMoiHelper(url);
            }

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void reLoad() {

    }

    @Override
    public void showNoData() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showTinMoiList(List<TinMoi> tinMois) {

    }
}
