package com.example.chiakiyamaoka.nomikaiapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class EventSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_set);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        setFragment();
    }



    public void setFragment() {

    /*    EventInfoFragment fragment = new EventInfoFragment();
        AttendConfirmFragment attendConfirmFragment = new AttendConfirmFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_image, fragment);
        fragmentTransaction.replace(R.id.fragment_attend_confirm, attendConfirmFragment);
        fragmentTransaction.commit();*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.findItem(R.id.add_event).setVisible(false);
        menu.findItem(R.id.delete_event).setVisible(true);
        menu.findItem(R.id.save_event).setVisible(true);
        return true;
    }
}
