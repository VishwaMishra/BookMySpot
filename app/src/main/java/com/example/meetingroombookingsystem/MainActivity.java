package com.example.meetingroombookingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button login,signUp;

    FirebaseDatabase rootnode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        login = (Button) findViewById(R.id.loginBtn);
        signUp = findViewById(R.id.SignUpBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = user.getText().toString();
                String passW = pass.getText().toString();

                if (name.equals("Admin")) {
                    if (passW.equals("Admin")) {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), AdminDashboard.class);
                        startActivity(i);
                    }
                }
            }

        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),CreateAccountActivity.class);
                startActivity(i);
            }

        });

    }
}