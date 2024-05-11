package com.example.olmazsa_soverim3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.olmazsa_soverim3.databinding.ActivityApplicationBinding;

public class ApplicationActivity extends AppCompatActivity {
    private ActivityApplicationBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityApplicationBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        NavigationUI.setupWithNavController(tasarim.bottomNav, navHostFragment.getNavController());
    }
}
