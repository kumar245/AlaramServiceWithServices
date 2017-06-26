package com.kumar.user.alaramservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by User on 6/25/2017.
 */

public class AlaramService extends Service {
    @Override
    public void onCreate() {
        Toast.makeText(this, "AlarmService Oncreate Method", Toast.LENGTH_SHORT).show();
    }



    @Nullable


    @Override
    public IBinder onBind(Intent intent) {

        Toast.makeText(this, "Alarm Service OnBind", Toast.LENGTH_SHORT).show();
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Alarm Service Destroy", Toast.LENGTH_SHORT).show();
    }


    @Override

    public void onStart(Intent intent, int startId) {

// TODO Auto-generated method stub

        super.onStart(intent, startId);

        Toast.makeText(this, "MyAlarmService.onStart()", Toast.LENGTH_LONG).show();

    }



    @Override

    public boolean onUnbind(Intent intent) {

// TODO Auto-generated method stub

        Toast.makeText(this, "MyAlarmService.onUnbind()", Toast.LENGTH_LONG).show();

        return super.onUnbind(intent);

    }
}
