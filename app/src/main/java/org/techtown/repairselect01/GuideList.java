package org.techtown.repairselect01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class GuideList extends AppCompatActivity {
    SinkFragment sinkFragment;
    BasinFragment basinFragment;
    BathroomFragment bathroomFragment;
    TileFragment tileFragment;
    PaintFragment paintFragment;
    WallpaperFragment wallpaperFragment;
    ShelfFragment shelfFragment;
    MonitorFragment monitorFragment;
    DoorknobFragment doorknobFragment;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        */

        sinkFragment = new SinkFragment();
        basinFragment = new BasinFragment();
        bathroomFragment = new BathroomFragment();
        tileFragment = new TileFragment();
        paintFragment = new PaintFragment();
        wallpaperFragment = new WallpaperFragment();
        shelfFragment = new ShelfFragment();
        monitorFragment = new MonitorFragment();
        doorknobFragment = new DoorknobFragment();

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("싱크대"));
        tabs.addTab(tabs.newTab().setText("세면대"));
        tabs.addTab(tabs.newTab().setText("화장실"));
        tabs.addTab(tabs.newTab().setText("타일"));
        tabs.addTab(tabs.newTab().setText("페인트"));
        tabs.addTab(tabs.newTab().setText("벽지"));
        tabs.addTab(tabs.newTab().setText("벽선반"));
        tabs.addTab(tabs.newTab().setText("모니터 받침대"));
        tabs.addTab(tabs.newTab().setText("문손잡이"));

        intent = getIntent();
        String data = intent.getStringExtra("value");

        if (data.equals("싱크대")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, sinkFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(0);
            tab.select();
        } else if (data.equals("세면대")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, basinFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(1);
            tab.select();
        } else if (data.equals("화장실")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, bathroomFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(2);
            tab.select();
        } else if (data.equals("타일")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, tileFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(3);
            tab.select();
        } else if (data.equals("페인트")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, paintFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(4);
            tab.select();
        } else if (data.equals("벽지")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, wallpaperFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(5);
            tab.select();
        } else if (data.equals("벽선반")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, shelfFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(6);
            tab.select();
        } else if (data.equals("모니터 받침대")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, monitorFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(7);
            tab.select();
        } else if (data.equals("문손잡이")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, doorknobFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(8);
            tab.select();
        }

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                Fragment selected = null;
                if (position == 0) {
                    selected = sinkFragment;
                } else if (position == 1) {
                    selected = basinFragment;
                } else if (position == 2) {
                    selected = bathroomFragment;
                } else if (position == 3) {
                    selected = tileFragment;
                } else if (position == 4) {
                    selected = paintFragment;
                } else if (position == 5) {
                    selected = wallpaperFragment;
                } else if (position == 6) {
                    selected = shelfFragment;
                } else if (position == 7) {
                    selected = monitorFragment;
                } else if (position == 8) {
                    selected = doorknobFragment;
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