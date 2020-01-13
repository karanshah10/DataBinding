package com.example.demodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.example.demodatabinding.databinding.ActivityUserListDetailBinding;

import java.util.ArrayList;

/**
 * Created by Admin on 21-07-2017.
 */

public class UserListDetailActivity extends AppCompatActivity {

    ActivityUserListDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_list_detail);

        ArrayAdapter<String> cityList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getCityList());
        binding.spnCity.setAdapter(cityList);

        if (getIntent() != null) {
            UserModel userModel = (UserModel) getIntent().getSerializableExtra("user");
            binding.setUser(userModel);
            binding.spnCity.setSelection(userModel.getCity());
        }

        binding.llParent.setClickable(false);
        binding.llParent.setOnClickListener(null);
        binding.llParent.setOnTouchListener(null);

        binding.chkCricket.setClickable(false);
        binding.chkCricket.setFocusable(false);
        binding.chkCricket.setOnClickListener(null);
        binding.chkCricket.setOnTouchListener(null);
        binding.chkCricket.setOnCheckedChangeListener(null);

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

}
