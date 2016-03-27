package com.example.dsouza.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MembersActivity extends ActionBarActivity {
    public static final String TAG="MEMBERS ACTIVITY";
    Button altarservers,animators;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        altarservers=(Button)findViewById(R.id.but_altarservers);
        animators=(Button)findViewById(R.id.but_animators);
    }

    public void goToAltarServers(View view) {
        Intent intent = new Intent(this, AltarServersActivity.class);
        Log.d(TAG, "to AltarServers");
        startActivity(intent);
    }

    public void goToAnimators(View view) {
        //Intent intent = new Intent(this, AnimatorsActivity.class);
        Log.d(TAG, "to Services");
        //startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_members, menu);
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
