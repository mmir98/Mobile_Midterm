package com.example.mobile_midterm;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoadDataHeadlessFragment extends Fragment {
    private static final String TAG = "LoadDataHeadlessFrag";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

        onLoadData();
    }

    private void onLoadData(){
        Log.d(TAG, "onLoadData");
        //load data from network
    }

}
