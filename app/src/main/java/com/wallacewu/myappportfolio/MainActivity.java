package com.wallacewu.myappportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSpotify = (Button) findViewById(R.id.button_spotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.spotify_streamer),
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonScores = (Button) findViewById(R.id.button_scores);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.scores_app),
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonLibrary = (Button) findViewById(R.id.button_library);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.library_app),
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonBuildBigger = (Button) findViewById(R.id.button_build_bigger);
        buttonBuildBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.build_bigger),
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonReader = (Button) findViewById(R.id.button_reader);
        buttonReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.xyz_reader),
                        Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_msg_prefix) + " " + getString(R.string.capstone_project),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
