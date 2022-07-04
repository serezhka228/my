package com.example.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    private EditText name_field;
    private EditText surname_field;
    private EditText email_field;
    private EditText pass_field;
    private EditText pass2_field;
    private Button reg_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name_field = findViewById(R.id.editTextTextEmailAddress4);
        surname_field =findViewById(R.id.editTextTextEmailAddress3);
        email_field = findViewById(R.id.editTextTextEmailAddress);
        pass_field = findViewById(R.id.editTextTextPassword2);
        pass2_field= findViewById(R.id.editTextTextPassword3);
        reg_bt = findViewById(R.id.button3);

        reg_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name_field.getText().toString().equals("")  || surname_field.getText().toString().equals("") || email_field.getText().toString().equals("")||pass_field.getText().toString().equals("") ||pass2_field.getText().toString().equals(""))
                    Toast.makeText(Registration.this, R.string.noText,Toast.LENGTH_SHORT).show();
                else{

                            Intent intent = new Intent(Registration.this, Menu.class);
                            startActivity(intent);
                            finish();


                }




            }
        });

    }


    public void toStartMenu(View view) {
        Intent intent = new Intent(this, StartMenu.class);
        startActivity(intent);
        finish();
    }
}