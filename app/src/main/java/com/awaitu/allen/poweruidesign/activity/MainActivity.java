package com.awaitu.allen.poweruidesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;





public class MainActivity extends Activity implements View.OnClickListener{
  private Button downloadAnimation;
  private Button menuAnimation;
  private Button splashAnimation;
  private Button listAnimation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }
  public void initView(){
    downloadAnimation = (Button)this.findViewById(R.id.downloadAnimation);
    menuAnimation = (Button)this.findViewById(R.id.menuAnimation);
    splashAnimation = (Button)this.findViewById(R.id.splashAnimation);
    listAnimation = (Button)this.findViewById(R.id.listAnimation);
    downloadAnimation.setOnClickListener(this);
    menuAnimation.setOnClickListener(this);
    splashAnimation.setOnClickListener(this);
    listAnimation.setOnClickListener(this);
  }
  public void onClick(View view){
    switch (view.getId()){
      case R.id.downloadAnimation:
        startActivity(new Intent(this,DownloadDialogActivity.class));
        break;
      case R.id.menuAnimation:
        startActivity(new Intent(this,MenuAnimationActivity.class));
        break;
      case R.id.splashAnimation:
        startActivity(new Intent(this,WowActivity.class));
        break;
      case R.id.listAnimation:
        startActivity(new Intent(this,WaveSideBarActivity.class));
        break;
    }
  }
}