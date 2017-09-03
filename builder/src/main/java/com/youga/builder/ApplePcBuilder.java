package com.youga.builder;

/**
 * Created by Youga on 2017/9/1.
 */

public class ApplePcBuilder extends Builder {

    private Computer mComputer = new AppleComputer();

    @Override
    public void cpu(int core) {
        mComputer.setCpuCore(core);
    }

    @Override
    public void ram(int gb) {
        mComputer.setRamSize(gb);
    }

    @Override
    public void os(String os) {
        mComputer.setOs(os);
    }

    @Override
    public Computer build() {
        return mComputer;
    }
}
