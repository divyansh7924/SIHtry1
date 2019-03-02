package com.example.sihtry1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class CreateReferralActivity extends AppCompatActivity {

    private Button create_referral_btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_referral);

        create_referral_btn_submit = (Button) findViewById(R.id.create_referral_btn_submit);
        create_referral_btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMainActivity iMainActivity = new IMainActivity();
                iMainActivity.createNewReferral(getApplicationContext(), "sdsdfjhgasdhgfvsadvbhg", "pranav", "bhardwaj", "geeta", "dsdf", "sdfsdg", 1234567896, 'a', "sdfgsdbdsgfbg", Calendar.getInstance().getTime(), "sdfgsdfgsdhsdghsdh", 2, 3, 4, "456231895", "acfgsfgsfcgsf", "vdfvsdfv", "dfvdfvdv", 123654);
            }
        });
    }
}
