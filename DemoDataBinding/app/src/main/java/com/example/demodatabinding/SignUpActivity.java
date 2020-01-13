package com.example.demodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.demodatabinding.databinding.ActivitySignupBinding;

import java.util.ArrayList;

/**
 * Created by Admin on 14-07-2017.
 */

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignupBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup);

        binding.setUser(LoginActivity.userModel);
        binding.setSignupActivity(this);


        ArrayAdapter<String> cityList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getCityList());
        binding.spnCity.setAdapter(cityList);

        binding.spnCity.setSelection(binding.getUser().getCity());
    }

    private ArrayList<String> getCityList() {

        ArrayList<String> strCityList = new ArrayList<>();

        strCityList.add("Ahmedabad");
        strCityList.add("Bharuch");
        strCityList.add("Navsari");
        strCityList.add("Surat");
        strCityList.add("Vadodara");

        return strCityList;
    }

    public void onSignUpClick(UserModel userModel) {

        Log.e("tag", "userModel: " + userModel);

        LoginActivity.userModel.setName(binding.etName.getText().toString().trim());
        if (binding.rbMale.isChecked()) {
            LoginActivity.userModel.setGender("male");
        } else if (binding.rbFemale.isChecked()) {
            LoginActivity.userModel.setGender("female");
        }
        LoginActivity.userModel.setMobile(binding.etMobile.getText().toString().trim());
        LoginActivity.userModel.setAge(binding.etAge.getText().toString().trim());
        if (binding.chkCricket.isChecked()) {
            LoginActivity.userModel.setCricket(true);
        } else {
            LoginActivity.userModel.setCricket(false);
        }
        if (binding.chkFootball.isChecked()) {
            LoginActivity.userModel.setFootball(true);
        } else {
            LoginActivity.userModel.setFootball(false);
        }
        if (binding.chkHokey.isChecked()) {
            LoginActivity.userModel.setHokey(true);
        } else {
            LoginActivity.userModel.setHokey(false);
        }
        LoginActivity.userModel.setCity(binding.spnCity.getSelectedItemPosition());
        LoginActivity.userModel.setEmail(binding.etEmail.getText().toString().trim());
        LoginActivity.userModel.setPassword(binding.etPassword.getText().toString().trim());
        binding.setUser(LoginActivity.userModel);
        Toast.makeText(this, "SignUp Successful", Toast.LENGTH_SHORT).show();
        finish();
    }


}
