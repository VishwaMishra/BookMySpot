package com.example.meetingroombookingsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {
    //variable
    Button create_Account;
    EditText email,pass,mobi_number;

    FirebaseDatabase rootnode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        //hooks for xml files
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        mobi_number = findViewById(R.id.mobinumber);
        create_Account = findViewById(R.id.create_account);

        //store data in firebase
        create_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailID = email.getText().toString();
                String passW = pass.getText().toString();
                String mobinum = mobi_number.getText().toString();

                rootnode = FirebaseDatabase.getInstance();
                reference = rootnode.getReference( "Users");
                UserDataClass userData = new UserDataClass(emailID,passW,mobinum);
                reference.child(mobinum).setValue(userData);


            }

        });

    }
}