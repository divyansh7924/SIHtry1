package com.example.sihtry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RCRActivity extends AppCompatActivity {

    private Button btn_create_new_referral;
    private Button btn_browse_nrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcr);

        btn_create_new_referral = (Button) findViewById(R.id.rcr_btn_create_new_ref);
        btn_browse_nrc = (Button)findViewById(R.id.browse_NRC);

        btn_create_new_referral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerChild();
            }
        });
        btn_browse_nrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                browsestate();
            }
        });
    }

    private void registerChild() {
        Intent intent = new Intent();
    }
    private void browsestate(){
        Intent intent = new Intent(this, StatesActivity.class);
        startActivity(intent);
    }
}
