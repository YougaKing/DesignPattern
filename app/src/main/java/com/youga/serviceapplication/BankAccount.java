package com.youga.serviceapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Youga on 2017/9/2.
 */

public class BankAccount implements Parcelable {
    private String name;
    private long money;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeLong(this.money);
    }

    public BankAccount() {
    }

    protected BankAccount(Parcel in) {
        this.name = in.readString();
        this.money = in.readLong();
    }

    public static final Creator<BankAccount> CREATOR = new Creator<BankAccount>() {
        @Override
        public BankAccount createFromParcel(Parcel source) {
            return new BankAccount(source);
        }

        @Override
        public BankAccount[] newArray(int size) {
            return new BankAccount[size];
        }
    };
}
