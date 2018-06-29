package com.example.home.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bb;
        bb=(Button)findViewById(R.id.ssss);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e( "Tag2","44444You Click cancel!!!!!");
                Toast.makeText(getApplicationContext(),"jjjjjjjjjjjjjj",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void do_my_work(View view){
        int i =10;
        Log.e( "ttttt","ddddddddddd");

    }
    public void do_cancel(){

        int i =10;
        Log.e( "Tag2","You Click cancel!!!!!");


    }

}
