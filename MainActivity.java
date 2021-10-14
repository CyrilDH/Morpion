
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {

    private Button mPlayButton1;
    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            mPlayButton1 = (Button) findViewById(R.id.button1);
            mPlayButton1.setOnClickListener(new Button.OnClickListener() {


                @Override

                public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, GameActivity.class);startActivity(intent);

                }

    });

    }
}










