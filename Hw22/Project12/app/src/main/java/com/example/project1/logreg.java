package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logreg extends AppCompatActivity {
    Button register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logreg);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
    }

    public void movetoResister(View view) {
            Intent register = new Intent(this, registerActivity.class);
            startActivity(register);
        }
    public void movetoLogin(View view) {
            Intent login = new Intent(this, login.class);
            startActivity(login);
    }
}
