package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Followup implements Parcelable {
    String nrc_id;
    Date date_of_discharge;
    String referral_id;
    int num_followups;



    protected Followup(Parcel in) {
    }

    public static final Creator<Followup> CREATOR = new Creator<Followup>() {
        @Override
        public Followup createFromParcel(Parcel in) {
            return new Followup(in);
        }

        @Override
        public Followup[] newArray(int size) {
            return new Followup[size];
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
