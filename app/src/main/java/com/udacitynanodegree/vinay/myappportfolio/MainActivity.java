package com.udacitynanodegree.vinay.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button score_app,library_app,build_it_bigger,xyz_reader,capstone;           //declaration of buttons
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        score_app= (Button) findViewById(R.id.scrapp);                          //initialize button SCORE APP
        score_app.setOnClickListener(new View.OnClickListener() {               //event handler for button SCORE APP
            public void onClick(View v) {
                String data = "This button will launch " + score_app.getText(); //string to be displayed by toast
                Toast toast = Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        library_app= (Button) findViewById(R.id.libapp);                        //initialize button LIBRARY APP
        library_app.setOnClickListener(new View.OnClickListener() {             //event handler for button LIBRARY APP
            public void onClick(View v) {
                String data="This button will launch "+library_app.getText();   //string to be displayed by toast
                Toast toast=  Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG);
                toast.show();
            }
        });

        build_it_bigger= (Button) findViewById(R.id.blditbig);                  //initialize button BUILD IT BIG
        build_it_bigger.setOnClickListener(new View.OnClickListener() {         //event handler for button BUILD IT BIG
            public void onClick(View v) {
                String data="This button will launch "+build_it_bigger.getText();//string to be displayed by toast
                Toast toast=  Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG);
                toast.show();
            }
        });

        xyz_reader= (Button) findViewById(R.id.xyzrdr);                         //initialize button XYZ READER
        xyz_reader.setOnClickListener(new View.OnClickListener() {              //event handler for button XYZ READER
            public void onClick(View v) {
                String data = "This button will launch " + xyz_reader.getText();    //string to be displayed by toast
                Toast toast = Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        capstone= (Button) findViewById(R.id.capstone);                         //initialize button CAPSTONE
        capstone.setOnClickListener(new View.OnClickListener() {                //event handler for button CAPSTONE
            public void onClick(View v) {
                String data="This button will launch "+capstone.getText();      //string to be displayed by toast
                Toast toast=  Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    /*On click event handler for Spotify Streamer*/
    public void btnClicked (View view)
    {
        String data="This button will launch SPOTIFY STREAMER";
        Toast toast=  Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG);
        toast.show();
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
