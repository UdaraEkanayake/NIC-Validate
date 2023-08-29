package com.example.validatenic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNic;
    Button btnNic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNic=(EditText) findViewById(R.id.editText);
        btnNic=(Button) findViewById(R.id.btnCheck);

    }

    public void checkValidity(View view) {
        btnNic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNic.getText().toString().length()==10){
                    Toast.makeText(MainActivity.this, "Valid NIC", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid NIC", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}