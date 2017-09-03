package com.youga.builder;


import android.support.v7.app.AlertDialog;

/**
 * Created by Youga on 2017/9/1.
 */

public abstract class Builder {

    AlertDialog.Builder mBuilder;

    public abstract void cpu(int core);

    public abstract void ram(int gb);

    public abstract void os(String os);

    public abstract Computer build();

}
