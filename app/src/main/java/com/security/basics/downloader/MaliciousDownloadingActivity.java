package com.security.basics.downloader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.security.basics.R;

public class MaliciousDownloadingActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.submit_credentials);
  }

  public void triggerDownload(View view) {
    Intent serviceIntent = new Intent();
    serviceIntent.setAction("com.security.basics.app.services.DOWNLOAD_DATA");
    startService(serviceIntent);
  }
}