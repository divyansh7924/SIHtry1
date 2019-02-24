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
    long phone;
    String email;
    boolean verified;


    public NRC(String user_id, int bed_count, int bed_vacant, String title, URL reg_certi, String address, String state, String city, int pincode, long phone, String email, boolean verified) {
        this.user_id = user_id;
        this.bed_count = bed_count;
        this.bed_vacant = bed_vacant;
        this.title = title;
        this.reg_certi = reg_certi;
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

    public int getBed_count() {
        return bed_count;
    }

    public void setBed_count(int bed_count) {
        this.bed_count = bed_count;
    }

    public int getBed_vacant() {
        return bed_vacant;
    }

    public void setBed_vacant(int bed_vacant) {
        this.bed_vacant = bed_vacant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public URL getReg_certi() {
        return reg_certi;
    }

    public void setReg_certi(URL reg_certi) {
        this.reg_certi = reg_certi;
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

    protected NRC(Parcel in) {
        String user_id;
        int bed_count;
        int bed_vacant;
        String title;
        URL reg_certi;
        String address;
        String state;
        String city;
        int pincode;
        long phone;
        String email;
        boolean verified;
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
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(user_id);
        parcel.writeInt(bed_count);
        parcel.writeInt(bed_vacant);
        parcel.writeString(title);
        parcel.writeString(reg_certi.toString());
        parcel.writeString(address);
        parcel.writeString(state);
        parcel.writeString(city);
        parcel.writeInt(pincode);
        parcel.writeLong(phone);
        parcel.writeString(email);
        parcel.writeBooleanArray(new boolean[]{verified});
    }
}
