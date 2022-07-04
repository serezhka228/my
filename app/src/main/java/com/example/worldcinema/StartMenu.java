package com.example.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartMenu extends AppCompatActivity {
    private EditText email_field;
    private EditText pass_field;
    private Button voyti_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);


        email_field = findViewById(R.id.editTextTextEmailAddress2);
        pass_field = findViewById(R.id.editTextTextPassword);
        voyti_bt = findViewById(R.id.button);


        voyti_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email_field.getText().toString().equals("")  || pass_field.getText().toString().equals(""))
                    Toast.makeText(StartMenu.this, R.string.noText,Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(StartMenu.this, Menu.class);
                    startActivity(intent);
                    finish();

                }

            }
        });
        }



    public void toRegAct(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }


}