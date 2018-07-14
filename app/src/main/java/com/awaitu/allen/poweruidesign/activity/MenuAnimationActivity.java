package com.awaitu.allen.poweruidesign.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.awaitu.allen.acllibrary.component.CircleMenuView;
import com.awaitu.allen.acllibrary.listener.OnMenuSelectedListener;
import com.awaitu.allen.acllibrary.listener.OnMenuStatusChangeListener;


public class MenuAnimationActivity extends AppCompatActivity {

    private CircleMenuView circleMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_animation);

        circleMenuView = (CircleMenuView) findViewById(R.id.circle_menu);

        circleMenuView.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.icon_menu, R.mipmap.icon_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.mipmap.icon_home)
                .addSubMenu(Color.parseColor("#30A400"), R.mipmap.icon_search)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.icon_notify)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.icon_setting)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.icon_gps)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {}

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {}

            @Override
            public void onMenuClosed() {}

        });
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        circleMenuView.openMenu();
        return super.onMenuOpened(featureId, menu);
    }
}
