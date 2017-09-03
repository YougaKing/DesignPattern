package com.youga.builder;

/**
 * Created by Youga on 2017/9/1.
 */

public abstract class Computer {

    protected int mCpuCore = 1;
    protected int mRamSize = 0;
    protected String mOs = "Dos";

    protected Computer() {
    }

    public abstract void setCpuCore(int cpuCore);

    public abstract void setRamSize(int gb);

    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer{" +
                "mCpuCore=" + mCpuCore +
                ", mRamSize=" + mRamSize +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
