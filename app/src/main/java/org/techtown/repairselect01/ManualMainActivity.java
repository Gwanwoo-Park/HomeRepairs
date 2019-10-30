package org.techtown.repairselect01;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class ManualMainActivity extends AppCompatActivity {
    HomeRepairManualFragment homeRepairManualFragment;
    AllVideosFragment allVideosFragment;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_main);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        */

        homeRepairManualFragment = new HomeRepairManualFragment();
        allVideosFragment = new AllVideosFragment();

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("집수리 매뉴얼"));
        tabs.addTab(tabs.newTab().setText("모든 동영상"));

        intent = getIntent();
        String data = intent.getStringExtra("name");

        if (data.equals("집수리 매뉴얼")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, homeRepairManualFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(0);
            tab.select();
        } else if (data.equals("동영상")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, allVideosFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(1);
            tab.select();
        }

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                Fragment selected = null;
                if (position == 0) {
                    selected = homeRepairManualFragment;
                } else if (position == 1) {
                    selected = allVideosFragment;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}