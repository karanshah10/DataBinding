package com.example.apple.databinding3;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import com.example.apple.databinding3.databinding.ActivityMainBinding;
import com.example.apple.databinding3.model.Movie;
import com.example.apple.databinding3.model.MovieStore;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final RecyclerView list = binding.list;
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        final ListAdapter listAdapter = new ListAdapter(MovieStore.getAllMovies());
        listAdapter.setOnItemClickListener(new ListAdapter.OnItenClickListener() {
            @Override
            public void onItemClick(int id, Movie movie) {
                startActivity(DetailAcitvity.buildIntent(getApplicationContext(),id));
            }
        });
        list.setAdapter(listAdapter);
    }
}
