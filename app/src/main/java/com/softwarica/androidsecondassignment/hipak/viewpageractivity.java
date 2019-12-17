package com.softwarica.androidsecondassignment.hipak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.softwarica.androidsecondassignment.R;

public class viewpageractivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpageractivity);

        viewPager =findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabid);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));



    }
}
