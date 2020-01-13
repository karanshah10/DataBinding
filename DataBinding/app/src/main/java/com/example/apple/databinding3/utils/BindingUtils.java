package com.example.apple.databinding3.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.example.apple.databinding3.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Apple on 6/20/2017.
 */

public class BindingUtils {
    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView view, String url) {
        view.setImageResource(R.drawable.activity);
    }
}
