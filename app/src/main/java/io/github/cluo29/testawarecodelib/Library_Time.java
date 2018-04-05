
package io.github.cluo29.testawarecodelib;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Comet on 04/10/16.
 */
public class Library_Time {

    public long startTime;


    public Library_Time() {
    }

    public void logStartTime(){
        startTime = System.nanoTime();
    }

    public void logStopTime(Context context, String testName){
        long timeUse = System.nanoTime() - startTime;

        ContentValues data = new ContentValues();
        data.put(Time_Result.TIMESTAMP, System.nanoTime());
        data.put(Time_Result.DEVICE_ID, testName);
        data.put(Time_Result.TIME, timeUse);
        context.getContentResolver().insert(Time_Result.CONTENT_URI, data);

    }
    //from lib
    public static String AUTHORITY = "io.github.cluo29.contextdatareading.provider.timeresult";

    public static final class Time_Result implements BaseColumns {
        private Time_Result() {
        }

        public static final Uri CONTENT_URI = Uri.parse("content://"
                + AUTHORITY + "/timeresult");

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.contextdatareading.timeresult";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.contextdatareading.timeresult";

        public static final String _ID = "_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String DEVICE_ID = "device_id"; //test id
        public static final String TIME = "time";

    }
}
