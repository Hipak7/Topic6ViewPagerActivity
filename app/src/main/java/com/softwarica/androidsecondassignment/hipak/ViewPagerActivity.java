package com.softwarica.androidsecondassignment.hipak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.softwarica.androidsecondassignment.R;
import com.softwarica.androidsecondassignment.hipak.adapter.ViewPagerAdapter;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.armstrong;
import com.softwarica.androidsecondassignment.hipak.fragments.automorphic;
import com.softwarica.androidsecondassignment.hipak.fragments.palindrome;
import com.softwarica.androidsecondassignment.hipak.fragments.simpleinterest;
import com.softwarica.androidsecondassignment.hipak.fragments.swapnumbers;

public class ViewPagerActivity extends AppCompatActivity {
   private ViewPager viewPager;
   private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabid);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new area(),"Area of Circle");
        viewPagerAdapter.addFragment(new armstrong(),"ArmStrong");
        viewPagerAdapter.addFragment(new automorphic(),"Automorphic");
        viewPagerAdapter.addFragment(new swapnumbers()," Swap Numbers");
        viewPagerAdapter.addFragment(new palindrome(),"Palindrome");
        viewPagerAdapter.addFragment(new simpleinterest(),"Simple Interest");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
