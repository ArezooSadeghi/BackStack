package com.example.backstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        mButton = findViewById(R.id.btn_go_d);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = D.newIntent(C.this);
                startActivity(intent);
                finish();
            }
        });
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, C.class);
    }
}