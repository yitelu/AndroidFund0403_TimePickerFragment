package com.ytl.timepickerfragment;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "time picker");

    }

    public void processTimePickerResult(int hour, int mins){
        String hour_string = Integer.toString(hour);
        String mins_string = Integer.toString(mins);

        Toast.makeText(this, "Time picked is: "+hour_string+" : "+mins_string, Toast.LENGTH_SHORT).show();
    }

}
