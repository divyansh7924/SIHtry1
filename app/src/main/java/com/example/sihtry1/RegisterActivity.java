package com.example.sihtry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button register_btn_login;
    private Button register_btn_register;
    private EditText register_tv_email;
    private EditText register_tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_btn_login = (Button) findViewById(R.id.register_btn_login);
        register_btn_register = (Button) findViewById(R.id.register_btn_register);
        register_tv_email = (EditText) findViewById(R.id.register_tv_email);
        register_tv_password = (EditText) findViewById(R.id.register_tv_password);

        register_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
