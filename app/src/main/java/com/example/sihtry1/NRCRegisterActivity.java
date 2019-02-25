package com.example.sihtry1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import java.net.MalformedURLException;
import java.net.URL;

public class NRCRegisterActivity extends AppCompatActivity {

    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("hello", "hello");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nrc_register);

        submit = (Button) findViewById(R.id.nrc_reg_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("NRCREGACT", "aa rha hai");
                IMainActivity iMainActivity = new IMainActivity();
                String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
                URL url = null;
                try {
                    url = new URL("https://stackoverflow.com/questions/6367509/how-to-use-intent-in-non-activity-class");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                iMainActivity.createNewNRC(getBaseContext(), userId, 20, 10, "NRC patel", url, "Patel nagar",
                        "Delhi", "New Delhi", 211321, 88888888, "jamal@jamal.jamal", false);
            }
        });
    }

}
