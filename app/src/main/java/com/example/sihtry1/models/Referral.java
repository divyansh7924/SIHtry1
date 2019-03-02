package com.example.sihtry1.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.database.IgnoreExtraProperties;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Nullable;

@IgnoreExtraProperties
public class Referral {
    String child_first_name;
    String referral_id;
    String child_last_name;
    String guadian_name;
    String nrc_id;
    String rcr_id;
    long guardian_aadhar_num;
    char child_gender;
    String child_pic;
    Date dob;
    String symptoms;
    int asha_measure;
    int height;
    int weight;
    String phone;
    String state;
    String city;
    int pincode;
    String address;

    public Referral(String referral_id, String child_first_name, String child_last_name, String guadian_name, String rcr_id, String nrc_id,
                    long guardian_aadhar_num, char child_gender, String child_pic, Date dob, String symptoms, int asha_measure, int height, int weight,
                    String phone, String address, String state, String city, int pincode) {
        this.child_first_name = child_first_name;
        this.child_last_name = child_last_name;
        this.referral_id = referral_id;
        this.guadian_name = guadian_name;
        this.nrc_id = nrc_id;
        this.rcr_id = rcr_id;
        this.guardian_aadhar_num = guardian_aadhar_num;
        this.child_gender = child_gender;
        this.child_pic = child_pic;
        this.dob = dob;
        this.symptoms = symptoms;
        this.asha_measure = asha_measure;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.address = address;
    }

//    private Date stringToDate(String dateString) {
//        String pattern = "E M d H:m:s z y";
//        DateFormat df = new SimpleDateFormat(pattern);
//        Date date = new Date();
//        try {
//            date = df.parse(dateString);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return date;
//    }

    public String getChild_first_name() {
        return child_first_name;
    }

    public void setChild_first_name(String child_first_name) {
        this.child_first_name = child_first_name;
    }

    public String getReferral_id() {
        return referral_id;
    }

    public void setReferral_id(String referral_id) {
        this.referral_id = referral_id;
    }

    public String getChild_last_name() {
        return child_last_name;
    }

    public void setChild_last_name(String child_last_name) {
        this.child_last_name = child_last_name;
    }

    public String getGuadian_name() {
        return guadian_name;
    }

    public void setGuadian_name(String guadian_name) {
        this.guadian_name = guadian_name;
    }

    public String getnrc_id() {
        return nrc_id;
    }

    public void setnrc_id(String nrc_id) {
        this.nrc_id = nrc_id;
    }

    public String getRcr_id() {
        return rcr_id;
    }

    public void setRcr_id(String rcr_id) {
        this.rcr_id = rcr_id;
    }

    public long getGuardian_aadhar_num() {
        return guardian_aadhar_num;
    }

    public void setGuardian_aadhar_num(long guardian_aadhar_num) {
        this.guardian_aadhar_num = guardian_aadhar_num;
    }

    public char getchild_gender() {
        return child_gender;
    }

    public void setchild_gender(char child_gender) {
        this.child_gender = child_gender;
    }

    public String getChild_pic() {
        return child_pic;
    }

    public void setChild_pic(String child_pic) {
        this.child_pic = child_pic;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getAsha_measure() {
        return asha_measure;
    }

    public void setAsha_measure(int asha_measure) {
        this.asha_measure = asha_measure;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
