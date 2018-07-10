package com.example.ahuang.myframe.activity.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.util.CommonMethod;
import com.example.ahuang.myframe.viewmodel.ViewModeClass.Car;
import com.example.ahuang.myframe.viewmodel.component.DaggerDaggerMainActivityComponent;

import javax.inject.Inject;

public class DaggerMainActivity extends AppCompatActivity {
    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_main);
        DaggerDaggerMainActivityComponent.create().inject(this);
        CommonMethod.showToast(DaggerMainActivity.this,mCar.work());

    }
}
