package org.techtown.repairselect01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(getApplicationContext(), GuideList.class);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);

        Button button_sink = (Button) findViewById(R.id.button_sink);
        button_sink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "싱크대");
                startActivity(intent);
            }
        });

        Button button_basin = (Button) findViewById(R.id.button_basin);
        button_basin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "세면대");
                startActivity(intent);
            }
        });

        Button button_bathroom = (Button) findViewById(R.id.button_bathroom);
        button_bathroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "화장실");
                startActivity(intent);
            }
        });

        Button button_tile = (Button) findViewById(R.id.button_tile);
        button_tile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "타일");
                startActivity(intent);
            }
        });

        Button button_paint = (Button) findViewById(R.id.button_paint);
        button_paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "페인트");
                startActivity(intent);
            }
        });

        Button button_wallpaper = (Button) findViewById(R.id.button_wallpaper);
        button_wallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "벽지");
                startActivity(intent);
            }
        });

        Button button_shelf = (Button) findViewById(R.id.button_shelf);
        button_shelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "벽선반");
                startActivity(intent);
            }
        });

        Button button_monitor = (Button) findViewById(R.id.button_monitor);
        button_monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "모니터 받침대");
                startActivity(intent);
            }
        });

        Button button_doorknob = (Button) findViewById(R.id.button_doorknob);
        button_doorknob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), GuideList.class);
                intent.putExtra("value", "문손잡이");
                startActivity(intent);
            }
        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_start: {
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return true;
                    }
                    case R.id.navigation_menual: {
                        intent = new Intent(getApplicationContext(), ManualMainActivity.class);
                        intent.putExtra("name", "집수리 매뉴얼");
                        startActivity(intent);
                        return true;
                    }
                    case R.id.navigation_cumu1: {
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("name", "동영상");
                        startActivity(intent);
                        return true;
                    }
                    case R.id.navigation_cumu2: {
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return true;
                    }
                    case R.id.navigation_toolguide: {
                        intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        return true;
                    }
                }
                return true;
            }
        });
    }
}

