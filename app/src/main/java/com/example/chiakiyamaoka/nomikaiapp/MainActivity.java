package com.example.chiakiyamaoka.nomikaiapp;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    Button mEventGenerate;
    Button mRestaurantSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EventFolderFragment fragment = new EventFolderFragment();
        final AttendConfirmFragment attendConfirmFragment = new AttendConfirmFragment();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*mEventGenerate = (Button) findViewById(R.id.event_generate);
        mRestaurantSearch = (Button) findViewById(R.id.restaurant_search);*/

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("イベントを企画する"));
        tabLayout.addTab(tabLayout.newTab().setText("お店を探す"));

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return fragment;
                    case 1:
                        return attendConfirmFragment;
                    default:
                        return null;
                }
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return "イベントを企画する";
                    case 1:
                        return "お店を探す";
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        /*mEventGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventSetActivity.class);
                startActivity(intent);
            }
        });

        mRestaurantSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventFolderFragment.class);
                startActivity(intent);
            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.add_event).setVisible(false);
        menu.findItem(R.id.delete_event).setVisible(false);
        menu.findItem(R.id.save_event).setVisible(false);
        return true;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
