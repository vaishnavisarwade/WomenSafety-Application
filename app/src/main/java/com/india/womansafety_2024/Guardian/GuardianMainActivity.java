package com.india.womansafety_2024.Guardian;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.databinding.DataBindingUtil;

import com.india.womansafety_2024.R;
import com.india.womansafety_2024.databinding.ActivityGuardianMainBinding;
import com.india.womansafety_2024.utils.SharedPrefConst;
import com.india.womansafety_2024.utils.SharedPrefUtils;

public class GuardianMainActivity extends AppCompatActivity {

    ActivityGuardianMainBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_guardian_main);
        setSupportActionBar(mBinding.toolbarGuardian);
        getSupportActionBar().setTitle("Hi, " + SharedPrefUtils.getStringData(SharedPrefConst.USER_NAME));

        Intent intent = new Intent(this, MapsActivity.class);
        //startActivity(intent);

        mBinding.btnNextActivity.setOnClickListener(v -> {
            startActivity(intent);
        });

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU)
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS}, 11);

        }
    }


}