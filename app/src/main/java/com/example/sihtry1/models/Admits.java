package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Date;
import java.sql.Timestamp;

public class Admits implements Parcelable {
    String nrc_id;
    String referral_id;
    int duration;
    Date date_of_admission;



    protected Admits(Parcel in) {
    }

    public static final Creator<Admits> CREATOR = new Creator<Admits>() {
        @Override
        public Admits createFromParcel(Parcel in) {
            return new Admits(in);
        }

        @Override
        public Admits[] newArray(int size) {
            return new Admits[size];
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
