package com.example.unreallover.mediaplayer.Entities;

/**
 * Created by Unreal Lover on 2017/11/8.
 */
public class LrcContent {
    private String lrcStr;  //歌词内容
    private int lrcTime;    //歌词当前时间
    public String getLrcStr() {
        return lrcStr;
    }
    public void setLrcStr(String lrcStr) {
        this.lrcStr = lrcStr;
    }
    public int getLrcTime() {
        return lrcTime;
    }
    public void setLrcTime(int lrcTime) {
        this.lrcTime = lrcTime;
    }
}