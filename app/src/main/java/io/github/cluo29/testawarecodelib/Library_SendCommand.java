package io.github.cluo29.testawarecodelib;

import android.content.Intent;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Comet on 04/10/16.
 */
public class Library_SendCommand {

    public Library_SendCommand(){
    }

    double speed;

    long startTimestamp;

    long endTimestamp;

    public void setSpeed(double speed1)
    {
        speed=speed1;
    }
    //to send command to start data sending, use API
    ArrayList<String>settings = new ArrayList<>();


    public void setStartTimestamp(long speed1)
    {
        startTimestamp=speed1;
    }

    public void setEndTimestamp(long speed1)
    {
        endTimestamp=speed1;
    }

    public void addDataSource(String speed1)
    {
        sensorList.add(speed1);
    }

    ArrayList<String> sensorList = new ArrayList();


    public void sendStart(Context context){

        //speed
        sensorList.add("Speed="+speed);

        Intent accel_dev = new Intent("ACTION_TESTAWARE_START");
        accel_dev.putExtra("sensorList",sensorList);
        //accel_dev.putExtra("data", rowData);
        context.sendBroadcast(accel_dev);
    }

    public void sendStop(Context context){
        Intent accel_dev = new Intent("ACTION_TESTAWARE_STOP");
        //accel_dev.putExtra("data", rowData);
        context.sendBroadcast(accel_dev);
    }
}
