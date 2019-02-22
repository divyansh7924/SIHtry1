package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;

public class NRC implements Parcelable {
    String user_id;
    int bed_count;
    int bed_vacant;
    String title;
    URL reg_certi;
    String address;
    String state;
    String city;
    int pincode;
    String phone;
    String email;
    String reg_num;
    boolean verified;


    protected NRC(Parcel in) {
    }

    public static final Creator<NRC> CREATOR = new Creator<NRC>() {
        @Override
        public NRC createFromParcel(Parcel in) {
            return new NRC(in);
        }

        @Override
        public NRC[] newArray(int size) {
            return new NRC[size];
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
