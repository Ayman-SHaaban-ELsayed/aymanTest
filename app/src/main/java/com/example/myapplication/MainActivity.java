package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    findViews();
   clickListeners(); }

    private void clickListeners() {
        Signup.setOnClickListener(v ->
                {
                    Intent intent = new Intent(MainActivity.this, SignUp_type.class);
                    startActivity(intent);
                }

                );
    }

    private void findViews() {
        Signup=findViewById(R.id.createAcc_btn);
    }


}