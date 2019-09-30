package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText email;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.emaillogin);
        pwd = findViewById(R.id.pwdlogin);
    }

    public void loginSubmit(View view) {
        if (email.getText().toString().matches("")||pwd.getText().toString().matches("")) {
            Toast.makeText(this, "Field Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
