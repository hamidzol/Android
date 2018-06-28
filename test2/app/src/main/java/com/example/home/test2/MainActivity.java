package com.example.home.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void do_my_work(View view){
        int i =10;
        Log.e( "ttttt","ddddddddddd");

    }
    public void do_cancel(View view){

        int i =10;
        Log.e( "Tag2","You Click cancel!!!!!");


    }

}
