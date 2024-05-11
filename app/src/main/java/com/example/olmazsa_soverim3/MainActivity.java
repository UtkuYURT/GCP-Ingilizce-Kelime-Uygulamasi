package com.example.olmazsa_soverim3;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.olmazsa_soverim3.databinding.ActivityMainBinding;
import com.example.olmazsa_soverim3.fragment.FragmentSigninPage;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        fragment();
    }

        public void fragment() {
            Fragment newFragment = new FragmentSigninPage();
            FragmentManager fragmentManager = getSupportFragmentManager();
            Fragment currentFragment = fragmentManager.findFragmentById(R.id.layout);
            if (currentFragment != null) {
                fragmentManager.beginTransaction().remove(currentFragment).commit();
            }
            fragmentManager.beginTransaction().add(R.id.layout, newFragment).commit();
        }
    }
