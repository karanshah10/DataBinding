package com.example.apple.databinding3;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.apple.databinding3.databinding.ListItemBinding;
import com.example.apple.databinding3.model.Movie;

import java.util.List;

/**
 * Created by Apple on 6/20/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    public interface OnItenClickListener{
        void onItemClick(final int id,final Movie movie);
    }

    private List<Movie> movies;
    private LayoutInflater layoutInflater;
    private AdapterView.OnItemClickListener onItemClickListener;
    public ListAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(layoutInflater==null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ListItemBinding binding = DataBindingUtil.inflate(layoutInflater,R.layout.list_item,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.binding.setMovie(movies.get(position));

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ListItemBinding binding;

        public ViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
}
