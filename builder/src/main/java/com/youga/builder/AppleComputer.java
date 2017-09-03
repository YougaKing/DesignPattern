package com.youga.builder;

/**
 * Created by Youga on 2017/9/1.
 */

public class AppleComputer extends Computer {

    @Override
    public void setCpuCore(int cpuCore) {
        mCpuCore = cpuCore;
    }

    @Override
    public void setRamSize(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }
    
}
