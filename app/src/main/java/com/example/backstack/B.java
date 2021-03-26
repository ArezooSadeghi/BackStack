package com.example.backstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        mButton = findViewById(R.id.btn_go_c);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = C.newIntent(B.this);
                startActivity(intent);
                finish();
            }
        });
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, B.class);
    }
}