package com.example.mobile_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String HeadlessFragmentTAG = "LoadDataFragment";

    LoadDataHeadlessFragment mHeadlessFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeadlessFragment = (LoadDataHeadlessFragment) getSupportFragmentManager().findFragmentByTag(HeadlessFragmentTAG);
        if (mHeadlessFragment == null){
            mHeadlessFragment = new LoadDataHeadlessFragment();
            getSupportFragmentManager().beginTransaction().add(mHeadlessFragment, HeadlessFragmentTAG).commit();
        }

    }
}
