package com.example.demodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demodatabinding.databinding.UserListFragmentBinding;

import java.util.ArrayList;

/**
 * Created by Admin on 14-07-2017.
 */

public class UserListFragment extends Fragment {

    private UserListFragmentBinding binding;
    private UserListRecyclerViewAdapter userListRecyclerViewAdapter;
    private ArrayList<UserModel> userModelArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.user_list_fragment, container, false);

        init();

        return binding.getRoot();
    }

    private void init() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        binding.recyclerView.setLayoutManager(linearLayoutManager);

        userListRecyclerViewAdapter = new UserListRecyclerViewAdapter(getActivity(), getUserList());
        binding.recyclerView.setAdapter(userListRecyclerViewAdapter);


    }

    private ArrayList<UserModel> getUserList() {

        userModelArrayList = new ArrayList<>();

        userModelArrayList.add(new UserModel("vatsal@gmail.com", "Vatsal Desai", "male", "25", "9638530089", true, true, false, 3));
        userModelArrayList.add(new UserModel("sanket@gmail.com", "Sanket Patel", "male", "28", "8536245785", false, true, true, 0));
        userModelArrayList.add(new UserModel("hiren@gmail.com", "Hiren Gohil", "male", "27", "8532451257", false, false, false, 2));
        userModelArrayList.add(new UserModel("komal@gmail.com", "Komal Bhatt", "female", "23", "9625874125", false, true, true, 3));
        userModelArrayList.add(new UserModel("ankit@gmail.com", "Ankit Solanki", "male", "34", "9524325478", true, false, false, 4));
        userModelArrayList.add(new UserModel("rohan@gmail.com", "Rohan Patel", "male", "30", "8523654125", false, false, true, 1));

        return userModelArrayList;
    }


}
