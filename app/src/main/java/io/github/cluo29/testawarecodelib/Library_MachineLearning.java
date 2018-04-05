package io.github.cluo29.testawarecodelib;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Comet on 04/10/16.
 */
public class Library_MachineLearning {

    public Library_MachineLearning() {
    }

    public void logResult(Context context, String testName, String contextString,
                          String expectedValue, String output, String assertion){

        ContentValues data = new ContentValues();
        data.put(Test_Result.TIMESTAMP, System.nanoTime());
        data.put(Test_Result.DEVICE_ID, testName);
        data.put(Test_Result.CONTEXT, contextString);
        data.put(Test_Result.EXPECTATION, expectedValue);
        data.put(Test_Result.OUTPUT, output);
        data.put(Test_Result.ASSERTION, assertion);
        context.getContentResolver().insert(Test_Result.CONTENT_URI, data);

    }

    public static String AUTHORITY = "io.github.cluo29.contextdatareading.provider.testresult";


    public static final class Test_Result implements BaseColumns {
        private Test_Result() {
        }

        public static final Uri CONTENT_URI = Uri.parse("content://"
                + AUTHORITY + "/testresult");
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.contextdatareading.testresult";
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.contextdatareading.testresult";

        public static final String _ID = "_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String DEVICE_ID = "device_id";
        public static final String CONTEXT = "context";
        public static final String EXPECTATION = "expectation";
        public static final String OUTPUT = "output";
        public static final String ASSERTION = "assertion";  //fail?
    }
}
