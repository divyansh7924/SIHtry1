package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;

public class RCR implements Parcelable {
    String user_id;
    URL reg_certi;
    String title;
    String address;
    String state;
    String city;
    int pincode;
    String phone;
    String email;
    String reg_num;
    boolean verified;


    protected RCR(Parcel in) {
    }

    public static final Creator<RCR> CREATOR = new Creator<RCR>() {
        @Override
        public RCR createFromParcel(Parcel in) {
            return new RCR(in);
        }

        @Override
        public RCR[] newArray(int size) {
            return new RCR[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
