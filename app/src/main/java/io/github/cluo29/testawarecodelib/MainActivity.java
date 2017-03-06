package io.github.cluo29.testawarecodelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




//whitebox

//1 download data, use API

        /*

        library_downloadDataProvider.downloadDataProvider(getApplicationContext(),
                "appName", //App Name
                "sensorName", // Data type
                "www.naive.com", //host
                3307,//port number
                "Luo_834",  //user name
                "exnklPLF", //password
                "Luo_834", //database name
                1235798573L,  //STARTTIMESTAMP
                1235998573L,  //End time,
                "d9a6bd96-5c8c-40fe-8acf-39ba083be22e"  //Device ID
                );
                */

//2 copy local data

    // to add a dataset, use API
    /*
    library_addDataProvider.addDataProvider(getApplicationContext(),
    "appName", //App Name
                "sensorName", // Data type
                "/storage/emulated/0/Download", //file path
                "screen.db", //file name
                1235798573L,  //STARTTIMESTAMP
                1235998573L,  //End time,
                "d9a6bd96-5c8c-40fe-8acf-39ba083be22e"  //Device ID
                );
            */


    //3 to start replay, use API
    /*
    library_sendCommand.setSpeed(speed);

    library_sendCommand.setStartTimestamp(startTimestamp);

    library_sendCommand.setEndTimestamp(endTimestamp);

    library_sendCommand.setAppName("Name of App");

    library_sendCommand.addDataSource("Accelerometer");

    library_sendCommand.sendStart(getApplicationContext());

    //to stop replay, use API
    library_sendCommand.sendStop(getApplicationContext());

*/
    //assertions


    // to do an assertion, use API
    /*library_result.logResult(getApplicationContext(), "Name of Test",
            "Context Values or Description","Expected Value", "Actual Value", "Assertion");

    //library_result.logResult(getApplicationContext(), "Unlock Test",
"Finding Icon Bug", "Line Number", "141", "Assertion");


*/




    //manipulate sensor data, e.g., create a value for accelerometer
//    accelerometer.addAccelerometerData(getApplicationContext(),1235798593L,"device_ID",
//            1f,2f,3f, //values of x,y,z
//            3,"label");

    /*
    // to record Machine learning result, use API
    library_result.logResult(getApplicationContext(), "Name of Test",
            "Context Values or Description","Expected Class", "Actual Class", "Classification");

    // to input a device power model, use API
    library_powerModel.addPowerModel(getApplicationContext(),
    "Device Name", "Sensor Name","Sensor Speed", powerUse);

    //to log processing time, use API
    library_time.logStartTime();

    //algorithms to be measured

    library_time.logStopTime(getApplicationContext(), "Name of Test");


*/

}
