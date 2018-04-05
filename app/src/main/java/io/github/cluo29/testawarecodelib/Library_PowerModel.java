package io.github.cluo29.testawarecodelib;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Comet on 04/10/16.
 */
public class Library_PowerModel {

    public Library_PowerModel(){
    }

    public static String AUTHORITY = "io.github.cluo29.contextdatareading.provider.powermodel";

    public static final class PowerModel_Result implements BaseColumns {
        private PowerModel_Result() {
        }
        public static final Uri CONTENT_URI = Uri.parse("content://"
                + AUTHORITY + "/powermodel");
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.contextdatareading.powermodel";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.contextdatareading.powermodel";

        public static final String _ID = "_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String DEVICE_NAME = "device_name";
        public static final String SENSOR = "sensor";
        public static final String SPEED = "speed";
        public static final String VALUE = "value";
    }

    public void addPowerModel(Context context, String device_name, String sensor, String speed, String value){
        ContentValues data = new ContentValues();
        data.put(PowerModel_Result.TIMESTAMP, System.nanoTime());
        data.put(PowerModel_Result.DEVICE_NAME, device_name);
        data.put(PowerModel_Result.SENSOR, sensor);
        data.put(PowerModel_Result.SPEED, speed);
        data.put(PowerModel_Result.VALUE, value);
        context.getContentResolver().insert(PowerModel_Result.CONTENT_URI, data);

    }
}
