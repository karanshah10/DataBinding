package com.example.demodatabinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.demodatabinding.databinding.ItemUserRecyclerViewBinding;

import java.util.ArrayList;

/**
 * Created by Admin on 14-07-2017.
 */

public class UserListRecyclerViewAdapter extends RecyclerView.Adapter<UserListRecyclerViewAdapter.UserDataViewHolder> {

    private Context context;
    private ArrayList<UserModel> userModelArrayList;

    public UserListRecyclerViewAdapter(Context context, ArrayList<UserModel> userModelArrayList) {
        this.context = context;
        this.userModelArrayList = userModelArrayList;
    }

    public class UserDataViewHolder extends RecyclerView.ViewHolder {

        private ItemUserRecyclerViewBinding binding;

        public UserDataViewHolder(ItemUserRecyclerViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

//        public void setUserData(UserModel model) {}

        public void onUserItemClick() {
            Intent intent = new Intent(context, UserListDetailActivity.class);
            intent.putExtra("user", userModelArrayList.get(getAdapterPosition()));
            context.startActivity(intent);
        }

    }

    @Override
    public UserListRecyclerViewAdapter.UserDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ItemUserRecyclerViewBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_user_recycler_view, parent, false);

        return new UserDataViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(UserListRecyclerViewAdapter.UserDataViewHolder holder, int position) {

        holder.binding.setVariable(com.example.demodatabinding.BR.userList, userModelArrayList.get(position));
        holder.binding.setUserList(userModelArrayList.get(position));
        holder.binding.setHolder(holder);
        holder.binding.executePendingBindings();

//        holder.setUserData(userModelArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return userModelArrayList.size();
    }

}
