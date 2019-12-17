package com.softwarica.androidsecondassignment.hipak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.softwarica.androidsecondassignment.R;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);


    }
}
