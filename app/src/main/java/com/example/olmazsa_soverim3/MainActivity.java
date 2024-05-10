package com.example.olmazsa_soverim3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.olmazsa_soverim3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
    }
}