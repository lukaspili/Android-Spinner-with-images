package com.siu.android.spinnerimages;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        List<String> images = new ArrayList<String>();
        images.add("image1");
        images.add("image2");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        SpinnerAdapter adapter = new SpinnerAdapter(this, images);
        spinner.setAdapter(adapter);
    }
}
