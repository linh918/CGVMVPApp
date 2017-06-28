package com.example.linh918.cgvmvpapp.models;

/**
 * Created by linh918 on 21/06/2017.
 */

public class TinMoi {
    private  String LinkPoster;
    private String TieuDe;
    private String NoiDung;

    public TinMoi(String linkPoster, String tieuDe, String noiDung) {
        LinkPoster = linkPoster;
        TieuDe = tieuDe;
        NoiDung = noiDung;
    }

    public TinMoi(){

    }

    public String getLinkPoster() {
        return LinkPoster;
    }

    public void setLinkPoster(String linkPoster) {
        LinkPoster = linkPoster;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }
}
