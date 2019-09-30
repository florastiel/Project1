package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
    Button submit;
    private EditText fname;
    private EditText lname;
    private EditText dob;
    private EditText email;
    private EditText pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        submit = findViewById(R.id.submit);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        dob = findViewById(R.id.dob);
        email = findViewById(R.id.email);
        pwd = findViewById(R.id.pwd);
    }


    public void submit(View view) {
        if (fname.getText().toString().length()>=30 || fname.getText().toString().length()<=3)
        {
            Toast.makeText(this, "First Name Invalid Length", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (lname.getText().toString().length()>=30 || lname.getText().toString().length()<=3)
        {
            Toast.makeText(this, "Last Name Invalid Length", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (dob.getText().toString().matches("")||email.getText().toString().matches("")||pwd.getText().toString().matches(""))
        {
            Toast.makeText(this, "Field Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        {
            Toast.makeText(this, "Registered", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, logreg.class);
            startActivity(i);
            return;
        }
    }
}
