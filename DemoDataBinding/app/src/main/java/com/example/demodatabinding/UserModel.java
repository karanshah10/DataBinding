package com.example.demodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.io.Serializable;

/**
 * Created by Admin on 14-07-2017.
 */

public class UserModel extends BaseObservable implements Serializable{

    private String email;
    private String password;
    private String name;
    private String gender;
    private String age;
    private String mobile;
    private boolean cricket;
    private boolean football;
    private boolean hokey;
    private int city;

    public UserModel() {
    }

    public UserModel(String email, String name, String gender, String age, String mobile, boolean cricket, boolean football, boolean hokey, int city) {
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
        this.cricket = cricket;
        this.football = football;
        this.hokey = hokey;
        this.city = city;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
        notifyPropertyChanged(BR.mobile);
    }

    @Bindable
    public boolean getCricket() {
        return cricket;
    }

    public void setCricket(boolean cricket) {
        this.cricket = cricket;
        notifyPropertyChanged(BR.cricket);
    }

    @Bindable
    public boolean getFootball() {
        return football;
    }

    public void setFootball(boolean football) {
        this.football = football;
        notifyPropertyChanged(BR.football);
    }

    @Bindable
    public boolean getHokey() {
        return hokey;
    }

    public void setHokey(boolean hokey) {
        this.hokey = hokey;
        notifyPropertyChanged(BR.hokey);
    }

    @Bindable
    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
        notifyPropertyChanged(BR.city);
    }
}
