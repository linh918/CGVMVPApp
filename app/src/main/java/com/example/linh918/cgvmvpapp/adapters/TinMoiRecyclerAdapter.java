package com.example.linh918.cgvmvpapp.adapters;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.linh918.cgvmvpapp.R;
import com.example.linh918.cgvmvpapp.models.TinMoi;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by linh918 on 28/06/2017.
 */

public class TinMoiRecyclerAdapter  extends RecyclerView.Adapter<TinMoiRecyclerAdapter.MyViewHolder> {
    private Context mContext;
    private List<TinMoi> mTinMois;

    public TinMoiRecyclerAdapter(Context context, List<TinMoi>tinMois) {
        this.mContext=context;
        this.mTinMois =tinMois;
        Toast.makeText(mContext,mTinMois.size()+"",Toast.LENGTH_SHORT).show();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.item_tin_moi_recycler,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TinMoi tinMoi= mTinMois.get(position);
        holder.display(tinMoi);
    }

    @Override
    public int getItemCount() {
        return mTinMois ==null|| mTinMois.isEmpty()? 0 : mTinMois.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
        private final AppCompatTextView mTvTitle;
        private final AppCompatImageView mImgAvatar;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTvTitle= (AppCompatTextView) itemView.findViewById(R.id.tvTitle);
            mImgAvatar=(AppCompatImageView) itemView.findViewById(R.id.imgAvatar);
        }

        public  void display(TinMoi tinMoi){
            if(tinMoi==null) return;
            mTvTitle.setText(tinMoi.getTieuDe());
            Picasso.with(mContext).
                    load(tinMoi.getLinkPoster()).
                    into(mImgAvatar);
        }
    }
}
