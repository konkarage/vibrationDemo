package com.example.goklagie.myapplication;

import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.goklagie.vibrate.testActivity;

public class MainActivity extends testActivity {

    private static final String TAGz = testActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // super(1);
        String TAG = "dbg";
        Log.d(TAG,"1");
        super.onCreate(savedInstanceState);
        Log.d(TAG,"2");
        setContentView(R.layout.activity_main);
        Log.d(TAG,"3");
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Log.d(TAG,"4");
     //   setSupportActionBar(toolbar);
        Log.d(TAG,"5");

        Button one = (Button) this.findViewById(R.id.button1);
        Log.d(TAGz,"soundStart");
        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d(TAGz,"soundStart2");
                try {
                    Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
                    r.play();
                    Log.d(TAGz,"sound");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
