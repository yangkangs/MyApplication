package cn.metamedical.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cn.metamedical.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test test = new Test();
        String text = test.getText();
    }
}