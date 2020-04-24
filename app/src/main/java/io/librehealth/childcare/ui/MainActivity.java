package io.librehealth.childcare.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import io.librehealth.childcare.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_settings);
        //setContentView(R.layout.activity_security_option);
//
//        try{
//            SystemClock.sleep(5000);
//
//            Intent intent = new Intent(this, SecurityOption.class);
//            startActivity(intent);
//            finish();
//        }
//        catch (Exception e){
//
//        }
    }
}
