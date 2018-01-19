package com.example.shaheenakader.serviceworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
        getFragmentManager().beginTransaction()
                .add(android.R.id.content,
                        new DownloadFragment()).commit();
    }
}
}
