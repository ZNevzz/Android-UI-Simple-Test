package com.example.dsouza.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ServicesActivity extends ActionBarActivity {

    public static final String TAG="SERVICES ACTIVITY";
    Button attendance,servings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        attendance=(Button)findViewById(R.id.but_attendance);
        servings=(Button)findViewById(R.id.but_servings);
    }


    public void goToAttendance(View view) {
        //Intent intent = new Intent(this, AttendanceActivity.class);
        Log.d(TAG, "to Attendance");
        //startActivity(intent);
    }

    public void goToServings(View view) {
        //Intent intent = new Intent(this, ServingsActivity.class);
        Log.d(TAG, "to Servings");
        //startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_services, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
