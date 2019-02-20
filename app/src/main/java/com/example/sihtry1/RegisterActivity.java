package com.example.sihtry1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button register_btn_login;
    private Button register_btn_register;
    private EditText register_et_email;
    private EditText register_et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_btn_login = (Button) findViewById(R.id.register_btn_login);
        register_btn_register = (Button) findViewById(R.id.register_btn_register);
        register_et_email = (EditText) findViewById(R.id.register_et_email);
        register_et_password = (EditText) findViewById(R.id.register_et_password);

        register_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        register_btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        String email, password;
        email = register_et_email.getText().toString().trim();
        password = register_et_password.getText().toString();

        if (email.isEmpty()) {
            register_et_email.setError("Cannot be empty");
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            register_et_email.setError("Not Valid Email");
            return;
        }
        if (password.isEmpty() || password.length() < 6) {
            register_et_password.setError("Must be 6 or more character long");
            return;
        }
        Toast.makeText(getApplicationContext(), "sdfgfg", Toast.LENGTH_SHORT).show();
    }

    private void login() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
