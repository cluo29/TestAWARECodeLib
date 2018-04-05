package io.github.cluo29.testawarecodelib;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Comet on 04/10/16.
 */
public class Library_AddDataProvider {

    public Library_AddDataProvider() {
    }

    public void addDataProvider(Context context, String appname, String sensor,
                                String dataset, long starttimestamp, long schedule, String status){

        ContentValues data = new ContentValues();
        data.put(Replay_Info.TIMESTAMP, System.nanoTime());
        data.put(Replay_Info.APPNAME, appname);
        data.put(Replay_Info.SENSOR, sensor);
        data.put(Replay_Info.DATASET, dataset);
        data.put(Replay_Info.STARTTIMESTAMP, starttimestamp);
        data.put(Replay_Info.SCHEDULE, schedule);
        data.put(Replay_Info.STATUS, status);
        context.getContentResolver().insert(Replay_Info.CONTENT_URI, data);
    }


    public static String AUTHORITY = "io.github.cluo29.contextdatareading.provider.replay";



    public static final class Replay_Info implements BaseColumns {
        private Replay_Info() {
        }

        public static final Uri CONTENT_URI = Uri.parse("content://"
                + AUTHORITY + "/replay");
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.contextdatareading.replay";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.contextdatareading.replay";

        public static final String _ID = "_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String APPNAME = "appname";
        public static final String SENSOR = "sensor";
        public static final String DATASET = "dataset";
        public static final String STARTTIMESTAMP = "starttimestamp";
        public static final String SCHEDULE = "schedule";  //120 sec later?
        public static final String STATUS = "status";
    }

}
