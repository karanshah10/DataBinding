package com.example.demodatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.demodatabinding.databinding.ActivityLoginBinding;

import org.androidannotations.annotations.EActivity;

//@EActivity
public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    public static UserModel userModel = new UserModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.setUser(userModel);
        binding.setLoginActivity(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.setUser(userModel);
    }

    public void onLoginClick() {

        if (!binding.etEmail.getText().toString().trim().equals(binding.getUser().getEmail())) {
            Toast.makeText(this, "Wrong Email", Toast.LENGTH_SHORT).show();
        } else if (!binding.etPassword.getText().toString().trim().equals(binding.getUser().getPassword())) {
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, TabActivity.class));
        }

    }

    public void onSignUpClick() {
        startActivity(new Intent(this, SignUpActivity.class));
    }

}
