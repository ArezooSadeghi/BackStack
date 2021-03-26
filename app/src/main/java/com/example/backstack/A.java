package com.example.backstack;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class A extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mButton = findViewById(R.id.btn_go_b);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = B.newIntent(A.this);
                startActivity(intent);
                finish();
            }
        });
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, A.class);
    }
}