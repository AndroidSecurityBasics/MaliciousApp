package com.security.basics.downloader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.security.basics.R;

public class MaliciousDownloadingActivity extends AppCompatActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.start_download);
  }

  public void startAnotherApp(View view) {
    Intent serviceIntent = new Intent();
    serviceIntent.setAction("com.security.basics.app.services.DOWNLOAD_DATA");
    startService(serviceIntent);
  }
}
