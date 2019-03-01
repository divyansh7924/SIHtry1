package com.example.sihtry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RCRActivity extends AppCompatActivity {

    private Button btn_create_new_referral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcr);

        btn_create_new_referral = (Button) findViewById(R.id.rcr_btn_create_new_ref);

        btn_create_new_referral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerChild();
            }
        });
    }

    private void registerChild() {
        Intent intent = new Intent();
    }
}
