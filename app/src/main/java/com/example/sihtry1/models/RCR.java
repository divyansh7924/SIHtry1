package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.MalformedURLException;
import java.net.URL;

public class RCR implements Parcelable {
    String user_id;
    URL reg_certi;
    String title;
    String address;
    String state;
    String city;
    int pincode;
    long phone;
    String email;
    boolean verified;

    public RCR(String user_id, URL reg_certi, String title, String address, String state, String city, int pincode, long phone, String email, boolean verified) {
        this.user_id = user_id;
        this.reg_certi = reg_certi;
        this.title = title;
        this.address = address;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.phone = phone;
        this.email = email;
        this.verified = verified;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public URL getReg_certi() {
        return reg_certi;
    }

    public void setReg_certi(URL reg_certi) {
        this.reg_certi = reg_certi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    protected RCR(Parcel in) {
        user_id = in.readString();
        try {
            reg_certi = new URL(in.readString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        title = in.readString();
        address = in.readString();
        state = in.readString();
        city = in.readString();
        pincode = in.readInt();
        phone = in.readLong();
        email = in.readString();
        boolean verified_array[] = new boolean[1];
        in.readBooleanArray(verified_array);
        verified = verified_array[0];
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
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(user_id);
        parcel.writeString(reg_certi.toString());
        parcel.writeString(title);
        parcel.writeString(address);
        parcel.writeString(state);
        parcel.writeString(state);
        parcel.writeInt(pincode);
        parcel.writeLong(phone);
        parcel.writeString(email);
        parcel.writeBooleanArray(new boolean[]{verified});
    }
}
