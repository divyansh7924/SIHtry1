package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;
import java.util.Date;

public class Referral implements Parcelable {
    String child_first_name;
    String referral_id;
    String child_last_name;
    String parent_name;
    String ncr_id;
    String rcr_id;
    Double aadhar_num;
    char gender;
    URL child_pic;
    Date dob;
    String symptoms;
    int asha_measure;
    int height;
    int weight;
    double phone;
    String state;
    String city;
    int pincode;
    String address;


    protected Referral(Parcel in) {
    }

    public static final Creator<Referral> CREATOR = new Creator<Referral>() {
        @Override
        public Referral createFromParcel(Parcel in) {
            return new Referral(in);
        }

        @Override
        public Referral[] newArray(int size) {
            return new Referral[size];
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
